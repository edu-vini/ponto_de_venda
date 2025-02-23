package com.pdv.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Produto produto;
    private Float totalVenda;
    private Float desconto;
    private Date deletedAt;

    public Venda(Cliente cliente, Produto produto, Float totalVenda, Float desconto){
        this.cliente = cliente;
        this.produto = produto;
        this.totalVenda = totalVenda;
        this.desconto = desconto;
    }

    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public Float getTotalVenda() {
        return totalVenda;
    }

    public Float getDesconto() {
        return desconto;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }
}
