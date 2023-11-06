package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Categoria;

public interface RepositoryCategoria extends JpaRepository<Categoria,Long> {
    
}
