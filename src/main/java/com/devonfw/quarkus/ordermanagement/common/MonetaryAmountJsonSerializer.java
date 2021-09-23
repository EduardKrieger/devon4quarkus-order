package com.devonfw.quarkus.ordermanagement.common;

import java.io.IOException;

import javax.money.MonetaryAmount;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class MonetaryAmountJsonSerializer extends JsonSerializer<MonetaryAmount>{

	  public static final String NUMBER = "amount";
	  public static final String CURRENCY = "currency";

	@Override
	public void serialize(MonetaryAmount value, JsonGenerator jgen, SerializerProvider serializers) throws IOException {
	    if (value != null) {
	        jgen.writeStartObject();
	        jgen.writeFieldName(MonetaryAmountJsonSerializer.CURRENCY);
	        jgen.writeString(value.getCurrency().getCurrencyCode());
	        jgen.writeFieldName(MonetaryAmountJsonSerializer.NUMBER);
	        jgen.writeString(value.getNumber().toString());
	        jgen.writeEndObject();
	      }
	}

}
