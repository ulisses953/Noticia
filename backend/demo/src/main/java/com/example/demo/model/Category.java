package com.example.demo.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;

    private String description;

    @ManyToMany(mappedBy = "categorias",fetch = FetchType.LAZY)
    private List<News> noticia;

    public String getTitle() {
        return title;
    }

    public void setTitle(String titulo) {
        this.title = titulo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descrisao) {
        this.description = descrisao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<News> getNoticia() {
        return noticia;
    }

    public void setNoticia(List<News> noticia) {
        this.noticia = noticia;
    }
    
}
