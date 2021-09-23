package com.devonfw.quarkus.ordermanagement.service.v1.model;

import java.time.Instant;
import javax.money.MonetaryAmount;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewItemDto {

	@Schema(nullable = false, description = "Item name", minLength= 3, maxLength = 500)
	private String name;

	// TODO hier wahrscheinlich auch kein Monetary
	@Schema(nullable = false, description = "Item price")
	private MonetaryAmount price;

	@Schema(nullable = false, description = "Item creation date")
	private Instant creationDate;

	// OrderEntity ??

}
