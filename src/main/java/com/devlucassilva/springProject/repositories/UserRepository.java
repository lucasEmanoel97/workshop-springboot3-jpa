package com.devlucassilva.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucassilva.springProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
