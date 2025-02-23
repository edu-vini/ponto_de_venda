package com.pdv.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Float custoCompra;
    private Float valorVenda;
    private Integer quantidade;
    private Date deletedAt;

    public Produto(String nome, Float custoCompra, Float valorVenda, Integer quantidade) {
        this.nome = nome;
        this.custoCompra = custoCompra;
        this.valorVenda = valorVenda;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Float getCustoCompra() {
        return custoCompra;
    }

    public Float getValorVenda() {
        return valorVenda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }
}
