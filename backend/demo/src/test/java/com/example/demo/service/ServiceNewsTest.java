package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.example.demo.model.News;
import com.example.demo.repository.RepositoryNews;

import net.bytebuddy.implementation.bind.annotation.Default;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest
public class ServiceNewsTest {
    
    @Autowired
    private ServiceNews serviceNews;
    @MockBean
    private RepositoryNews repositoryNews;

    @Test()
    void DeleteIdNullExeption() throws Exception {

    }
    @Test()
    void DeleteId() throws Exception{

    }


    @Test
    void testFindAll() {

    }

    @Test
    void testFindById() {

    }

    @Test
    void testIdFilterCategory() {

    }

    @Test
    void testIdFilterUser() {

    }

    @Test
    void testSave() {

    }

    @Test
    void testUpdate() {

    }
}
