package com.devonfw.quarkus.ordermanagement.service.v1.model;

import java.time.Instant;
import javax.money.MonetaryAmount;

import com.devonfw.quarkus.ordermanagement.domain.model.OrderEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDto {

	private Long id;

	private String name;

	private MonetaryAmount price;

	private OrderEntity order;

	private Instant creationDate;
}
