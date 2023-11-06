package com.example.demo.error;

import java.util.Date;

public class ErroPadrao {
    private String titulo;
    private String descrisao;
    private int codigo;
    private Date data;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescrisao() {
        return descrisao;
    }
    public void setDescrisao(String descrisao) {
        this.descrisao = descrisao;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public ErroPadrao() {
    }
    
    public ErroPadrao(String titulo, String descrisao, int codigo, Date data) {
        this.titulo = titulo;
        this.descrisao = descrisao;
        this.codigo = codigo;
        this.data = data;
    }

    
}
