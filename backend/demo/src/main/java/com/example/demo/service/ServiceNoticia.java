package com.example.demo.service;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.error.IdNotFoundInDatabase;
import com.example.demo.interfaces.ServiceInterface;
import com.example.demo.model.Category;
import com.example.demo.model.News;
import com.example.demo.model.User;
import com.example.demo.repository.RepositoryCategory;
import com.example.demo.repository.RepositoryNoticia;
import com.example.demo.repository.RepositoryUser;

@Service
public class ServiceNoticia implements ServiceInterface<News, UUID>{
    @Autowired
    private RepositoryNoticia repositoryNoticia;
    @Autowired
    private RepositoryUser repositoryUser;
    @Autowired
    private RepositoryCategory repositoryCategory;

    @Override
    public News save(News obj)  {
        


        obj.setAutor(getUser(obj.getAutor()));

        obj.setCategorias(getCategories(obj.getCategorias()));

        repositoryNoticia.save(obj);
        return obj;
    }

    /**
     * 
     * @param user
     * @return
     * @author Ulisses953
     * @throws ClassNotFoundException
     */
    protected User getUser(User user)  {
        if(user.getId() == null){
            return user;
        }
        return repositoryUser.findById(user.getId()).orElseThrow(() -> new IdNotFoundInDatabase(""));
    }
    /**
     * 
     * @param categories 
     * @return 
     * @author Ulisses953
     * @throws ClassNotFoundException
     */
    private List<Category> getCategories(List<Category> categories) {
        for(int i = 0; i < categories.size(); i++){
            if(categories.get(i).getId() != null){
               categories.add(i, repositoryCategory.findById(categories.get(i).getId()).orElseThrow(() -> new IdNotFoundInDatabase("")));
            }
        }
        return categories;
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
