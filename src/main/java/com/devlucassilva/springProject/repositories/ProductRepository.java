package com.devlucassilva.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucassilva.springProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
