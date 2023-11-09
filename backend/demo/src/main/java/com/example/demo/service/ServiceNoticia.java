package com.example.demo.service;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.ServiceInterface;
import com.example.demo.model.News;
import com.example.demo.model.User;
import com.example.demo.repository.RepositoryNoticia;
import com.example.demo.repository.RepositoryUser;

@Service
public class ServiceNoticia implements ServiceInterface<News, UUID>{
    @Autowired
    private RepositoryNoticia repositoryNoticia;

    private RepositoryUser repositoryUser;

    @Override
    public News save(News obj) {
        repositoryNoticia.save(obj);
        return obj;
    }

    

    private User getUsuario(UUID id){
        return repositoryUser.findById(id).get();
    }

    @Override
    public News findById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public News delete(News obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<News> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public News update(News obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public List<News> findAllById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    


}
