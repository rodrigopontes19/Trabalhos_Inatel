package com.inatel.dm112prova.controller;

import com.inatel.dm112prova.entity.Endereco;
import com.inatel.dm112prova.repository.EnderecoRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class EnderecoController {

    EnderecoRepositorio enderecoRepositorio;


    @GetMapping(value = "/endereco")
    public Iterable<Endereco> EnderecoRetorno(){
        return enderecoRepositorio.findAll();
    }

}
