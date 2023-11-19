package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.error.ExceptionNotNull;
import com.example.demo.error.IdNotFoundDatabase;
import com.example.demo.interfaces.ServiceInterface;
import com.example.demo.model.Category;
import com.example.demo.model.News;
import com.example.demo.model.User;
import com.example.demo.repository.RepositoryCategory;
import com.example.demo.repository.RepositoryNews;
import com.example.demo.repository.RepositoryUser;

@Service
public class ServiceNews implements ServiceInterface<News, UUID>{
    @Autowired
    private RepositoryNews repositoryNews;
    @Autowired
    private RepositoryUser repositoryUser;
    @Autowired
    private RepositoryCategory repositoryCategory;

    @Override
    public News save(News obj) throws IdNotFoundDatabase  {
        obj.setAuthor(idFilterUser(obj.getAuthor()));
        obj.setCategorias(idFilterCategory(obj.getCategorias()));

        repositoryNews.save(obj);


        return obj;
    }

    /**
     * 
     * @param user
     * @return
     * @author Ulisses953
     * @throws IdNotFoundDatabase
     * 
     */
    protected User idFilterUser(User user) throws IdNotFoundDatabase {
        if(user.getId() == null){
            return user;
        }
        return repositoryUser.findById(user.getId()).orElseThrow(() -> new IdNotFoundDatabase("id not found :" +  user.getId()));
    }
    /**
     * 
     * @param categories 
     * @return 
     * @author Ulisses953
     * @throws IdNotFoundDatabase
     * 
     */
    protected List<Category> idFilterCategory(List<Category> categories) throws IdNotFoundDatabase {
        for(int i = 0; i < categories.size(); i++){
            if(categories.get(i).getId() != null){
               categories.add(i, repositoryCategory.findById(
                categories.get(i).getId()).orElseThrow(() -> new IdNotFoundDatabase("id not found ")));
            }
        }
        return categories;
    } 

    @Override
    public Optional<News> findById(UUID id) throws ExceptionNotNull {
        if(id == null){
            throw new ExceptionNotNull("id is null");
        }

        return repositoryNews.findById(id); 
    }
    
    @Override
    public News delete(News obj) throws Exception {
        if(obj.getId() == null) {
            throw new ExceptionNotNull("id is null");
        }
        
        final News OBJDATABESE = findById(obj.getId()).get(); 

        repositoryNews.deleteById(OBJDATABESE.getId());

        return OBJDATABESE;
    }

    @Override
    public List<News> findAll() {
        return (List<News>) repositoryNews.findAll();
    }

    @Override
    public News update(News obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }


    


}
