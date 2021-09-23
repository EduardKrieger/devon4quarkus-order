package com.devonfw.quarkus.ordermanagement.service.v1.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.models.media.Schema.SchemaType;

import com.devonfw.quarkus.ordermanagement.common.OrderStatus;

import javax.money.MonetaryAmount;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;

@Getter
@Setter
public class NewOrderDto {
	//TODO
	@Schema(nullable = false, description = "Order price")// , type = OBJECT )
	private MonetaryAmount price;

	@Schema(nullable = false, description ="Order creation Date")
	private Instant creationDate;

	@Schema(nullable = true, description ="Order payment Date")
	private Instant paymentDate;

	@Schema(nullable = false, description ="Order status" )// type enum )
	private OrderStatus status;
}
