package com.example.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.News;

public interface RepositoryNews extends JpaRepository<News,UUID>{
    
}
