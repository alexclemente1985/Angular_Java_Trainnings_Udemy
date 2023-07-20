package io.github.alexclemente1985;


import io.github.alexclemente1985.entities.Cliente;
import io.github.alexclemente1985.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClienteRepository repository){
        return args -> {
            Cliente cliente = new Cliente("Fulano", "16750923704");
            repository.save(cliente);
        };
    }
    public static void main(String[] args){
        SpringApplication.run(ClientesApplication.class, args);

        System.out.println("Running Springboot application");
    }
}
