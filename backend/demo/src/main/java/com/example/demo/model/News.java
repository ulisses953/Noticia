package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String title;

    private String description;
    
    private LocalDate date; 

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private User author;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Category> categorias;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate data) {
        this.date = data;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User autor) {
        this.author = autor;
    }

    public List<Category> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Category> categorias) {
        this.categorias = categorias;
    }

    public News() {
    }

    public News(String title, String description, LocalDate date, User author, List<Category> categorias) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.author = author;
        this.categorias = categorias;
    }



    

    

    

}
