package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.model.Address;
import io.swagger.client.model.AluPaymentOption;
import io.swagger.client.model.AluRequest;
import io.swagger.client.model.AluResponse;
import io.swagger.client.model.AluResponseRaw;
import io.swagger.client.model.Billing;
import io.swagger.client.model.CardPaymentOption;
import io.swagger.client.model.ContactPerson;
import io.swagger.client.model.Merchant;
import io.swagger.client.model.OrderItem;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;

public final class AluV3API {

	private static final ApiClient client = new ApiClient();

	public static void main(String[] args) throws ApiException {
		final Merchant superman = new Merchant().key("Superman").secretKey("krypton");

		DefaultApi raw = new DefaultApi(client);
		AluV3API api = new AluV3API(raw);

		final ContactPerson customer = new ContactPerson()
				.firstName("General")
				.lastName("Zod")
				.email("zod@krypton")
				.phone("+1234567890");
		final Address customerAddress = new Address()
				.addressLine("Star X")
				.countryCode("US");

		final AluRequest request = new AluRequest()
				.merchant(superman)
				.orderRef(UUID.randomUUID().toString())
				.payMethod(AluRequest.PayMethodEnum.CCVISAMC)
				.orderDate(DateTime.now())
				.currency("RUB")
				.orderItems(Collections.singletonList(
						new OrderItem()
								.name("Standard general purpose computer")
								.price(BigDecimal.valueOf(1251.14))
								.quantity(1)
				))
				.billing(new Billing()
						.contactPerson(customer)
						.address(customerAddress))
				.paymentOptions(new AluPaymentOption()
					.creditCard(new CardPaymentOption()
						.ccNumber("4111111111111111")
						.cvv(012)
						));

		final AluResponse response = api.createOrder(request);
		System.out.println(response);
	}


	private DefaultApi api;

	public AluV3API(DefaultApi api) {
		this.api = api;
	}

	public AluResponse createOrder(final AluRequest request) throws ApiException {
		validateRequest(request);

		final AluResponseRaw raw = api.createOrder(
				resolve(()->request.getMerchant().getKey()).orElseThrow(ApiException::new),
				resolve(request::getOrderRef).orElseThrow(ApiException::new),
				resolve(request::getOrderDate).orElseThrow(ApiException::new),
				resolve(()->request.getBilling().getContactPerson().getLastName()).orElse(null),
				resolve(()->request.getBilling().getContactPerson().getFirstName()).orElse(null),
				resolve(()->request.getBilling().getContactPerson().getEmail()).orElse(null),
				resolve(()->request.getBilling().getContactPerson().getPhone()).orElse(null),
				resolve(()->request.getBilling().getAddress().getCountryCode()).orElse(null),
				resolve(()->request.getBilling().getDocumentId().getDocumentType().toString()).orElse(null),
				resolve(()->request.getBilling().getDocumentId().getDocumentNumber()).orElse(null),
				resolve(()->request.getBilling().getAddress().getAddressLine()).orElse(null),
				resolve(()->request.getBilling().getAddress().getZipCode()).orElse(null),
				resolve(()->request.getBilling().getAddress().getCity()).orElse(null),
				resolve(()->request.getDelivery().getContactPerson().getLastName()).orElse(null),
				resolve(()->request.getDelivery().getContactPerson().getFirstName()).orElse(null),
				resolve(()->request.getDelivery().getContactPerson().getPhone()).orElse(null),
				resolve(()->request.getDelivery().getAddress().getAddressLine()).orElse(null),
				resolve(()->request.getDelivery().getAddress().getZipCode()).orElse(null),
				resolve(()->request.getDelivery().getAddress().getCity()).orElse(null),
				resolve(()->request.getDelivery().getAddress().getState()).orElse(null),
				resolve(()->request.getDelivery().getAddress().getCountryCode()).orElse(null),
				request.getOrderItems().get(0).getName(),
				request.getOrderItems().get(0).getCode(),
				request.getOrderItems().get(0).getPrice(),
				request.getOrderItems().get(0).getQuantity(),
				request.getPayMethod().toString(),
				request.getContinueUri(),
				null,
				resolve(()->request.getPaymentOptions().getCreditCard().getCcNumber()).orElse(null),
				resolve(()->Integer.toString(request.getPaymentOptions().getCreditCard().getExpMonth())).orElse(null),
				resolve(()->Integer.toString(request.getPaymentOptions().getCreditCard().getExpYear())).orElse(null),
				resolve(()->Integer.toString(request.getPaymentOptions().getCreditCard().getCvv())).orElse(null),
				resolve(()->request.getPaymentOptions().getCreditCard().getCcOwner()).orElse(null),
				resolve(()->request.getPaymentOptions().getToken().getCcToken()).orElse(null),
				resolve(()->request.getOrderItems().get(0).getInfo()).orElse(null),
				resolve(()->request.getOrderItems().get(0).getVersion()).orElse(null),
				resolve(()->BigDecimal.valueOf(request.getPaymentOptions().getInstallments().getNumberOfInstallments())).orElse(null),
				resolve(()->request.getPaymentOptions().getInstallments().getCardProgramName()).orElse(null),
				resolve(()->Integer.toString(request.getOrderTimeout())).orElse(null),
				resolve(()->request.getPaymentOptions().getLoyaltyPoints()).map(p -> "YES").orElse(null),
				resolve(()->Double.toString(request.getPaymentOptions().getLoyaltyPoints().getAmount())).orElse(null),
				resolve(()->request.getPaymentOptions().getInstallments().getCampaignType().toString()).orElse(null),
				resolve(()->request.getShipping().getCost().toString()).orElse(null),
				resolve(()->request.getPosCode()).orElse(null),
				resolve(()->request.getBilling().getFax()).orElse(null),
				resolve(()->request.getBilling().getAddress().getAddressLine1()).orElse(null),
				resolve(()->request.getBilling().getAddress().getState()).orElse(null),
				resolve(()->request.getDelivery().getContactPerson().getEmail()).orElse(null),
				resolve(()->request.getDelivery().getCompany()).orElse(null),
				resolve(()->request.getDelivery().getAddress().getAddressLine1()).orElse(null),
				resolve(()->request.getPaymentOptions().getCreditCard().getEnableToken()).map(b -> b ? "1" : null).orElse(null),
				resolve(()->request.getPaymentOptions().getCreditCard().getEnableToken()).map(b -> b ? "PAY_BY_CLICK" : null).orElse(null),
				resolve(()->request.getPaymentOptions().getCreditCard().getCcNumberTime()).orElse(null),
				resolve(()->request.getPaymentOptions().getCreditCard().getCcOwnerTime()).orElse(null),
				resolve(()->request.getClientIp()).orElse(null),
				resolve(()->request.getClientTime()).orElse(null),
				resolve(()->request.getOrderItems().get(0).getVat()).orElse(null),
				resolve(()->request.getOrderItems().get(0).getPriceType().toString()).orElse(null),
				resolve(()->request.getCurrency()).orElse(null),
				resolve(()->request.getOrderItems().get(1).getName()).orElse(null),
				resolve(()->request.getOrderItems().get(1).getCode()).orElse(null),
				resolve(()->request.getOrderItems().get(1).getPrice()).orElse(null),
				resolve(()->request.getOrderItems().get(1).getVat()).orElse(null),
				resolve(()->request.getOrderItems().get(1).getPriceType().toString()).orElse(null),
				resolve(()->request.getOrderItems().get(1).getQuantity()).orElse(null),
				resolve(()->request.getOrderItems().get(2).getName()).orElse(null),
				resolve(()->request.getOrderItems().get(2).getCode()).orElse(null),
				resolve(()->request.getOrderItems().get(2).getPrice()).orElse(null),
				resolve(()->request.getOrderItems().get(2).getVat()).orElse(null),
				resolve(()->request.getOrderItems().get(2).getPriceType().toString()).orElse(null),
				resolve(()->request.getOrderItems().get(2).getQuantity()).orElse(null),
				resolve(()->request.getOrderItems().get(3).getName()).orElse(null),
				resolve(()->request.getOrderItems().get(3).getCode()).orElse(null),
				resolve(()->request.getOrderItems().get(3).getPrice()).orElse(null),
				resolve(()->request.getOrderItems().get(3).getVat()).orElse(null),
				resolve(()->request.getOrderItems().get(3).getPriceType().toString()).orElse(null),
				resolve(()->request.getOrderItems().get(3).getQuantity()).orElse(null),
				resolve(()->request.getOrderItems().get(4).getName()).orElse(null),
				resolve(()->request.getOrderItems().get(4).getCode()).orElse(null),
				resolve(()->request.getOrderItems().get(4).getPrice()).orElse(null),
				resolve(()->request.getOrderItems().get(4).getVat()).orElse(null),
				resolve(()->request.getOrderItems().get(4).getPriceType().toString()).orElse(null),
				resolve(()->request.getOrderItems().get(4).getQuantity()).orElse(null),
				resolve(()->request.getOrderItems().get(5).getName()).orElse(null),
				resolve(()->request.getOrderItems().get(5).getCode()).orElse(null),
				resolve(()->request.getOrderItems().get(5).getPrice()).orElse(null),
				resolve(()->request.getOrderItems().get(5).getVat()).orElse(null),
				resolve(()->request.getOrderItems().get(5).getPriceType().toString()).orElse(null),
				resolve(()->request.getOrderItems().get(5).getQuantity()).orElse(null));

		return new AluResponse()
				.amount(raw.getAMOUNT())
				.cardProgramName(raw.getCARDPROGRAMNAME())
				.completeTxnRedirectUri(raw.getURLREDIRECT())
				.continueUri3Ds(raw.getURL3DS());
	}

	private void validateRequest(AluRequest request) throws ApiException {
		if (request.getOrderItems() == null || request.getOrderItems().isEmpty()) {
			throw new ApiException("There is no item for ALU orderItems");
		}
	}

	private static <T> Optional<T> resolve(Supplier<T> supp) {
		try {
			return Optional.ofNullable(supp.get());
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			return Optional.empty();
		}
	}
}
