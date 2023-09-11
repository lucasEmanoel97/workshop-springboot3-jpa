package br.com.devlucassilva.workshop.repositories;

import br.com.devlucassilva.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
/*
* A annotation @Repository é opcional nesta insterface, pois está
* herdando da classe JpaRepository<User, Long> que ja possui esta annotation.
* */