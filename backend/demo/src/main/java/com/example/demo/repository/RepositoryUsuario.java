package com.example.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Usuario;

public interface RepositoryUsuario extends JpaRepository<Usuario,UUID>{
    
}
