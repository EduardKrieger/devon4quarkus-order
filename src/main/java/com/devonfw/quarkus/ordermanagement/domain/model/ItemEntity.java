package com.devonfw.quarkus.ordermanagement.domain.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.devonfw.quarkus.general.domain.model.ApplicationPersistenceEntity;

import javax.money.MonetaryAmount;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Item")
public class ItemEntity extends ApplicationPersistenceEntity{

	private String name;
	private MonetaryAmount price;
	private OrderEntity order;
	private Instant creationDate;

	@Id
	@GeneratedValue
	private Long id;



}
