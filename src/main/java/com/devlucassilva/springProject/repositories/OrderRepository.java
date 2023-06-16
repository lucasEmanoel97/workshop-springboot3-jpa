package com.devlucassilva.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucassilva.springProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
