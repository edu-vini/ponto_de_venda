package com.pdv.repository;

import org.springframework.data.repository.CrudRepository;

import com.pdv.model.Venda;


public interface VendaRepository extends CrudRepository<Venda, Long> {
    Venda findById(long id);
}
