package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.ServiceUsuario;

@RestController
@RequestMapping("api/usuario")
public class ControllerUsuario {
    @Autowired
    private ServiceUsuario serviceUsuario;
    @GetMapping("/login")
    public ResponseEntity<User> login(String email, String password) {
        return new ResponseEntity(serviceUsuario.login(email, password),HttpStatus.OK);
    }

    @PostMapping("/registrar")
    public ResponseEntity registrar(User Usuario) {
        serviceUsuario.save(Usuario);

        return ResponseEntity.ok("Usuario registrado com sucesso");
    }


}   
