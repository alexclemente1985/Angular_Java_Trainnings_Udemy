package com.alexandre.udemy.cursocompletojava.springbootjpahib.repositories;

import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.Order;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
