package com.devonfw.quarkus.ordermanagement.service.v1.model;

import java.time.Instant;

import javax.money.MonetaryAmount;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSearchCriteriaDto {

	@QueryParam("id")
	private Long id;

	@QueryParam("page")
	@DefaultValue("0")
	private int pageNumber = 0;

	@QueryParam("size")
	@DefaultValue("10")
	private int pageSize = 10;

	@QueryParam("name")
	private String name;

	// TODO hier wäre glaube ich auch BIG Decimal richtiger
	  @QueryParam("priceMin")
	  private MonetaryAmount priceMin;

	  @QueryParam("priceMax")
	  private MonetaryAmount priceMax;

	  @QueryParam("price")
	  private MonetaryAmount price;

		// TODO vll auch kein INSTANT hier
		@QueryParam("minCreationDate")
		private Instant minCreationDate;

		@QueryParam("maxCreationDate")
		private Instant maxCreationDate;

		@QueryParam("creationDate")
		private Instant creationDate;

}
