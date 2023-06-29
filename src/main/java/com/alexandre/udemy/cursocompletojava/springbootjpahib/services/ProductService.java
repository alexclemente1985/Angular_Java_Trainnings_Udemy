package com.alexandre.udemy.cursocompletojava.springbootjpahib.services;

import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.Product;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.User;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.repositories.ProductRepository;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);

        return obj.get();
    }

}
