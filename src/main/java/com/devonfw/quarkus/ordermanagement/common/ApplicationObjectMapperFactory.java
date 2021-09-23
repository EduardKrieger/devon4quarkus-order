package com.devonfw.quarkus.ordermanagement.common;

import javax.inject.Named;
import javax.money.MonetaryAmount;

import com.devonfw.module.json.common.base.ObjectMapperFactory;

import com.fasterxml.jackson.databind.module.SimpleModule;


@Named("ApplicationObjectMapperFactory")
public class ApplicationObjectMapperFactory extends ObjectMapperFactory {

	public ApplicationObjectMapperFactory() {
		super();
		SimpleModule module = getExtensionModule();
		module.addSerializer(MonetaryAmount.class, new MonetaryAmountJsonSerializer());
		module.addDeserializer(MonetaryAmount.class, new MonetaryAmountJsonDeserializer());


	}
}
