package com.pdv.repository;

import org.springframework.data.repository.CrudRepository;

import com.pdv.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    Cliente findById(long id);
}
