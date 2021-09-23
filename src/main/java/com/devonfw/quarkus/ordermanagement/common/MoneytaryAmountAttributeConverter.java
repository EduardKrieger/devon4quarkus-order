package com.devonfw.quarkus.ordermanagement.common;

import java.math.BigDecimal;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter//(autoApply = true)
public class MoneytaryAmountAttributeConverter implements AttributeConverter<MonetaryAmount, BigDecimal> {


	@Override
	public BigDecimal convertToDatabaseColumn(MonetaryAmount attribute) {
		return attribute.getNumber().numberValueExact(BigDecimal.class);
	}

	@Override
	public MonetaryAmount convertToEntityAttribute(BigDecimal dbData) {
		CurrencyUnit euro = Monetary.getCurrency("EUR");
		MonetaryAmount mta = Monetary.getDefaultAmountFactory().setCurrency(euro).setNumber(dbData).create();
		return mta;
	}

}
