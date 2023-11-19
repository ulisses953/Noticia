package com.example.demo.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.error.DefaltError;
import com.example.demo.interfaces.ControllerInterface;
import com.example.demo.model.News;
import com.example.demo.service.ServiceNews;


@RestController
@RequestMapping("/noticia")
public class ControllerNews implements ControllerInterface<News, UUID>{
    @Autowired
    private ServiceNews serviceNoticia;

    @Override
    public ResponseEntity<?> save(News obj) {
        try {
            return new ResponseEntity(serviceNoticia.save(obj),HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity(new DefaltError("Not found",e.toString(),404,new Date()), HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity update(News obj, UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity update(News obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity delete(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public ResponseEntity findById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public ResponseEntity findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    

    
    
}
