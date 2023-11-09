package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.RepositoryUser;

@Service
public class ServiceUsuario {
    @Autowired
    private RepositoryUser repositoryUsuario;

    public User login(String email, String password) {
        return repositoryUsuario.login(email, password);
    }

    public User save(User usuario) {
        return repositoryUsuario.save(usuario);
    }
    
    public void delete(User usuario) {
        repositoryUsuario.delete(usuario);
    }

    public User findByEmail(String email) {
        return repositoryUsuario.findByEmail(email);
    }
    
    public List<User> findAll() {
        return repositoryUsuario.findAll();
    }
}
