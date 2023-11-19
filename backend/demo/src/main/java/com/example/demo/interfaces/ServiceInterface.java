package com.example.demo.interfaces;

import java.util.List;
import java.util.Optional;

public interface ServiceInterface<T, ID>{
    
    public T save(T obj) throws Exception;

    public Optional<T> findById(ID id) throws Exception;

    public T delete(T obj) throws Exception;

    public List<T> findAll();
    
    public T update(T obj);

}
