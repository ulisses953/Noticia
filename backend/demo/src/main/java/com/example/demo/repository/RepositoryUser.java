package com.example.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface RepositoryUser extends JpaRepository<User,UUID>{
    
    @Query(value = "from User where email = :email and senha = :senha")
    public User login(String email,String senha);

    public User findByEmail(String email);
}
