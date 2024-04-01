package com.inatel.dm112prova.controller;

import com.inatel.dm112prova.entity.Cliente;
import com.inatel.dm112prova.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ClienteContoller {

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @GetMapping("/cliente")
    public Iterable<Cliente> ClienteRetorno(){
        return clienteRepositorio.findAll();
    }
}
