package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.enums.PoderesUser;
import com.example.demo.model.User;

@SpringBootTest
public class RepositoryUserTest {
    @Autowired
    RepositoryUser repositoryUser;


    @Test
    @DisplayName("")
    void testFindByEmail() {
      
    }

    @Test
    void testLogin() {
        
    }
}
