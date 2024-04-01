package com.inatel.dm112prova.controller;

import com.inatel.dm112prova.entity.Produto;
import com.inatel.dm112prova.repository.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ProdutoController {

    @Autowired
    ProdutoRepositorio produtoRepositorio;

    public Iterable<Produto> ProdutoRetorno(){
        return produtoRepositorio.findAll();
    }

}
