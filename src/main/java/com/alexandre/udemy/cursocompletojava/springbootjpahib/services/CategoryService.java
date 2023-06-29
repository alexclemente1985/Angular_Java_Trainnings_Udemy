package com.alexandre.udemy.cursocompletojava.springbootjpahib.services;

import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.Category;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.User;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.repositories.CategoryRepository;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);

        return obj.get();
    }

}
