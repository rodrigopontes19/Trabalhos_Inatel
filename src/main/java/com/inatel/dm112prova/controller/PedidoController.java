package com.inatel.dm112prova.controller;

import com.inatel.dm112prova.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class PedidoController {

    @Autowired
    PedidoController pedidoController;

    @GetMapping(value = "/pedido")
    public List<Pedido> PedidoRetorno(){
        return pedidoController.PedidoRetorno();
    }

}
