package com.alexandre.udemy.cursocompletojava.springbootjpahib.repositories;

import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.Category;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
