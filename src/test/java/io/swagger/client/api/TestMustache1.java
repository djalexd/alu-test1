package io.swagger.client.api;

import com.samskivert.mustache.Mustache;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestMustache1 {

	@SuppressWarnings("unchecked")
	@Test
	public void test1() {
		final Mustache.Compiler mustache = Mustache.compiler();
		final String template = "{{#data}}{{this}}{{/data}}";
		final Object context = new Object() {
			public Map<String, Object> data = new HashMap() {{
				put("k1", "v1");
				put("k2", "v2");
			}};
		};

		Assert.assertEquals("v1,v2", mustache.compile(template).execute(context));
	}
}
