package br.com.devlucassilva.workshop.repositories;

import br.com.devlucassilva.workshop.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
