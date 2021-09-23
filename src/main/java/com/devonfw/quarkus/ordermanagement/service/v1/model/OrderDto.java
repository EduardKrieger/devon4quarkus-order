package com.devonfw.quarkus.ordermanagement.service.v1.model;

import java.time.Instant;
import javax.money.MonetaryAmount;
import javax.validation.constraints.NotNull;

import com.devonfw.quarkus.ordermanagement.common.OrderStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {

	private MonetaryAmount price;

	@NotNull // ??
	private Instant creationDate;

	private Instant paymentDate;

	private OrderStatus status;

}
