package io.github.alexclemente1985.repositories;

import io.github.alexclemente1985.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
