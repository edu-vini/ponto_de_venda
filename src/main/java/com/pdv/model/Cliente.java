package com.pdv.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer tipo;
    private String documento;
    private String nome;
    private Date deletedAt;

    public Cliente(Integer tipo, String documento, String nome){
        this.tipo = tipo;
        this.documento = documento;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public Integer getTipo() {
        return tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNome() {
        return nome;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }
}