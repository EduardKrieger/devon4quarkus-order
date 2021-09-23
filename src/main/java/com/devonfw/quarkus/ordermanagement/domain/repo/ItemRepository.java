package com.devonfw.quarkus.ordermanagement.domain.repo;

import org.springframework.data.repository.CrudRepository;

import com.devonfw.quarkus.ordermanagement.domain.model.ItemEntity;

public interface ItemRepository extends CrudRepository<ItemEntity, Long>, ItemFragment{

	// TODO

}
