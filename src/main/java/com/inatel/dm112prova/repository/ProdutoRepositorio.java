package com.inatel.dm112prova.repository;

import com.inatel.dm112prova.entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepositorio extends CrudRepository<Produto,Long> {
}
