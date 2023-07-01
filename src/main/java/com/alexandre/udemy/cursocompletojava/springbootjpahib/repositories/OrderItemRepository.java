package com.alexandre.udemy.cursocompletojava.springbootjpahib.repositories;

import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.OrderItem;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
