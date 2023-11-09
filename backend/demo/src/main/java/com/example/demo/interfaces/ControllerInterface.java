package com.example.demo.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface ControllerInterface<T, ID> {
    public ResponseEntity<T> save(T obj);
    public ResponseEntity<T> update(T obj,ID id);
    public ResponseEntity<T> update(T obj);
    public ResponseEntity<T> delete(ID id);
    public ResponseEntity<T> findById(ID id);
    public ResponseEntity<T> findAll();
}
