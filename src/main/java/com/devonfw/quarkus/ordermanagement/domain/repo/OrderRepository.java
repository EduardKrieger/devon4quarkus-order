package com.devonfw.quarkus.ordermanagement.domain.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.devonfw.quarkus.ordermanagement.domain.model.OrderEntity;


public interface OrderRepository extends CrudRepository<OrderEntity, Long>, OrderFragment {

	// order sollt doch eine ID haben sonst sehe ich wenig sinn

}
