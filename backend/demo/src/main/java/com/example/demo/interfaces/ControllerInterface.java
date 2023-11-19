package com.example.demo.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface ControllerInterface<T, ID> {
    public ResponseEntity<?> save(T obj);
    public ResponseEntity<?> update(T obj,ID id);
    public ResponseEntity<?> update(T obj);
    public ResponseEntity<?> delete(ID id);
    public ResponseEntity<?> findById(ID id);
    public ResponseEntity<?> findAll();
}
