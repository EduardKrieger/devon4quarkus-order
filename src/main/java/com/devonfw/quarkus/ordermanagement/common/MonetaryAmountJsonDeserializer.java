package com.devonfw.quarkus.ordermanagement.common;

import java.io.IOException;
import java.math.BigDecimal;

import javax.money.Monetary;
import javax.money.MonetaryAmount;

import org.zalando.jackson.datatype.money.MonetaryAmountFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


//TODO
public final class MonetaryAmountJsonDeserializer extends JsonDeserializer<MonetaryAmount>{

	@Override
	public MonetaryAmount deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode jNode = mapper.readTree(p);
			BigDecimal number = jNode.decimalValue();
		    String currencyCode = jNode.
		    //MonetaryAmount mta = Monetary.getDefaultAmountFactory()
		    	//.setCurrency(currencyCode)
		    	//.setNumber(number)
		    	//.create();
		    while(jNode.iterator().hasNext()) {
		    	jNode.iterator().next().toString();
		    }
		    return null;
	}


}
