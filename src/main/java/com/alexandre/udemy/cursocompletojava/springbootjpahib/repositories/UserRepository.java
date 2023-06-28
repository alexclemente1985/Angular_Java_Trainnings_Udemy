package com.alexandre.udemy.cursocompletojava.springbootjpahib.repositories;

import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
