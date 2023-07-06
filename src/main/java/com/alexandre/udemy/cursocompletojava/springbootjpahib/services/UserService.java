package com.alexandre.udemy.cursocompletojava.springbootjpahib.services;

import com.alexandre.udemy.cursocompletojava.springbootjpahib.entities.User;
import com.alexandre.udemy.cursocompletojava.springbootjpahib.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

        return obj.get();
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
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
