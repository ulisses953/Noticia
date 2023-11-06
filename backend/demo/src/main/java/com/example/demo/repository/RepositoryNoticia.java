package com.example.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Noticia;

public interface RepositoryNoticia extends JpaRepository<Noticia,UUID>{
    
}
