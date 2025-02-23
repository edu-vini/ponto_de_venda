package com.pdv.repository;

import org.springframework.data.repository.CrudRepository;

import com.pdv.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
    Produto findById(long id);
}
