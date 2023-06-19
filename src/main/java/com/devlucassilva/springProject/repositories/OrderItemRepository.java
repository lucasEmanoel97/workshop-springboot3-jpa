package com.devlucassilva.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucassilva.springProject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
