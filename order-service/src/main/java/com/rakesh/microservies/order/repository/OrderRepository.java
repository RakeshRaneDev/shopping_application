package com.rakesh.microservies.order.repository;

import com.rakesh.microservies.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order , Long> {
}
