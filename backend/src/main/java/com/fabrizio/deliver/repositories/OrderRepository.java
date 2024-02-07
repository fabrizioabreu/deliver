package com.fabrizio.deliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabrizio.deliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
