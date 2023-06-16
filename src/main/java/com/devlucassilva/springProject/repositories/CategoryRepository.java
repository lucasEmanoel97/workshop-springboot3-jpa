package com.devlucassilva.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucassilva.springProject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
