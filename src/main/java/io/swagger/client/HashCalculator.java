package io.swagger.client;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.swagger.client.model.Merchant;

/**
 * Calculator that gets used for parameter signing of Gecad.
 */
public final class HashCalculator {

	public static class HashConfiguration {
		String algorithm;
		boolean includeEmptyParameters;
		boolean includeParamsLength;
		String parameterOrder;
		List<String> parameters;
		List<String> skipParameters;
		
		public HashConfiguration() {
			this("HmacMD5", true, true, "alphabetically", new ArrayList<>(), new ArrayList<>());
		}
		
		public HashConfiguration(String algorithm, boolean includeEmptyParameters, boolean includeParamsLength, String parameterOrder, List<String> parameters, List<String> skipParameters) {
			this.algorithm = algorithm;
			this.includeEmptyParameters = includeEmptyParameters;
			this.includeParamsLength = includeParamsLength;
			this.parameterOrder = parameterOrder;
			this.parameters = parameters;
			this.skipParameters = skipParameters;
		}
	}

	/**
	 * Calculates the hash based on source object and configuration.
	 */
	public static String calculateHash(
			final Map<String, Object> source,
			final HashConfiguration cfg,
			final Merchant merchant) {

		final Comparator<Map.Entry<String, Object>> fieldNamesCmp = (f1, f2) -> {
			if ("alphabetically".equalsIgnoreCase(cfg.parameterOrder)) {
				return f1.getKey().compareTo(f2.getKey());
			} else if ("fixed".equalsIgnoreCase(cfg.parameterOrder)) {
				// Order is imposed by 'parameters' list. What is not
				// defined there goes to the end of the list, unordered.
				int index1 = cfg.parameters.indexOf(f1.getKey()), index2 = cfg.parameterOrder.indexOf(f2.getKey());
				if (index1 > -1) {
					if (index2 > -1) {
						// compare the 2 indices.
						return Integer.valueOf(index1).compareTo(index2);
					} else {
						// f1 is indeed before f2
						return -1;
					}
				} else {
					if (index2 > -1) {
						// f2 is before f1
						return 1;
					} else {
						// both are missing, add at end
						return 0;
					}
				}
			} else {
				throw new IllegalArgumentException(String.format("Invalid 'parameterOrder' value: %s", cfg.parameterOrder));
			}
		};

		final Predicate<Map.Entry<String, Object>> isFieldValueNotNull = f -> f.getValue() != null;

		@SuppressWarnings("unchecked")
		final Function<Object, Stream<?>> streamCollection = o -> {
			if (o instanceof Collection) {
				return ((Collection<String>) o).stream();
			} else {
				return Stream.of(o);
			}
		};

		final Function<Object, String> objectToString = o -> {
			if (o instanceof String) {
				String s = (String) o;
				if (s.isEmpty() && !cfg.includeEmptyParameters) {
					return "";
				}

				if (cfg.includeParamsLength) {
					return s.length() + s;
				} else {
					return s;
				}
			} else {
				throw new IllegalArgumentException(String.format("Write some code for converting '%s' to String", o.getClass()));
			}
		};

		final String strToSign = source
				.entrySet()
				.stream()
				.sorted(fieldNamesCmp)
				.filter(isFieldValueNotNull)
				.filter(f -> !cfg.skipParameters.contains(f.getKey()))
				.map(Map.Entry::getValue)
				.flatMap(streamCollection)
				.map(objectToString)
				.collect(Collectors.joining());

		try {
			final SecretKeySpec signingKey = new SecretKeySpec(
					merchant.getSecretKey().getBytes(StandardCharsets.UTF_8),
					cfg.algorithm);
			final Mac mac = Mac.getInstance(cfg.algorithm);
			mac.init(signingKey);
			// compute the hmac on input data bytes
			byte[] rawHmac = mac.doFinal(strToSign.getBytes());
			// convert to hex string
			return bytesToHex(rawHmac);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static String bytesToHex(byte[] bytes) {
		final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
				'9', 'a', 'b', 'c', 'd', 'e', 'f' };
		char[] hexChars = new char[bytes.length * 2];
		int v;
		for (int j = 0; j < bytes.length; j++) {
			v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}
}
