package com.example.demo.interfaces;

import java.util.List;

public interface ServiceInterface<T, ID>{
    
    public T save(T obj);

    public T findById(ID id);

    public T delete(T obj);

    public List<T> findAll();
    
    public T update(T obj);

    public List<T> findAllById(ID id);

}
