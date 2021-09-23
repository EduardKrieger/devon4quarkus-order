package com.devonfw.quarkus.ordermanagement.service.v1.model;

import javax.money.MonetaryAmount;
import java.time.Instant;
import com.devonfw.quarkus.ordermanagement.common.OrderStatus;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderSearchCriteriaDto {

	// TODO vll auch kein INSTANT hier
	@QueryParam("minCreationDate")
	private Instant minCreationDate;

	@QueryParam("maxCreationDate")
	private Instant maxCreationDate;

	@QueryParam("creationDate")
	private Instant creationDate;

	@QueryParam("minPaymentDate")
	private Instant minPaymentDate;

	@QueryParam("maxPaymentDate")
	private Instant maxPaymentDate;

	@QueryParam("paymentDate")
	private Instant paymentDate;

	@QueryParam("orderStatus")
	private OrderStatus status;

	@QueryParam("page")
	@DefaultValue("0")
	private int pageNumber = 0;

	@QueryParam("size")
	@DefaultValue("10")
	private int pageSize = 10;


	// TODO hier wäre glaube ich auch BIG Decimal richtiger
	  @QueryParam("priceMin")
	  private MonetaryAmount priceMin;

	  @QueryParam("priceMax")
	  private MonetaryAmount priceMax;

	  @QueryParam("price")
	  private MonetaryAmount price;

}
