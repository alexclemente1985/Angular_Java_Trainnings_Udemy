package com.alexandre.udemy.cursocompletojava.springbootjpahib.repositories;

import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
