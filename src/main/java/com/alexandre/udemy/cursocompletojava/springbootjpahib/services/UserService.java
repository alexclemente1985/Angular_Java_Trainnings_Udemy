package com.alexandre.udemy.cursocompletojava.springbootjpahib.services;

import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.User;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.repositories.UserRepository;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.services.exceptions.DatabaseException;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
    //exceção 500 se user não estiver presente
    //    return obj.get();
        return obj.orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        try{
            repository.deleteById(id);
        } catch(EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch(DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj){
        //Prepara o obj sem precisar ir para o banco de dados
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
