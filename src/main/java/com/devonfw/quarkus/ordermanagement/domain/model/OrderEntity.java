package com.devonfw.quarkus.ordermanagement.domain.model;


import java.time.Instant;
import javax.money.MonetaryAmount;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devonfw.quarkus.general.domain.model.ApplicationPersistenceEntity;
import com.devonfw.quarkus.ordermanagement.common.OrderStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Order")
public class OrderEntity extends ApplicationPersistenceEntity{

	private MonetaryAmount price;

	private Instant creationDate;

	private Instant paymentDate;

	private OrderStatus status;

}
