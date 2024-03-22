package com.inatel;

import java.util.ArrayList;

public class Pedido implements ConsultaNotifica {
    
    private int idPedido;
    private String enderecoEmail;
    private String statusPedido;
    private String statusEntrega;

    @Override
    public void notificarCliente(int idCliente){

    }

    public void registrarPedido(Cliente cliente,ArrayList<Produto> prodrutos){

    }

    public void alterarPedido(int idPedido,int idProduto){

    }

    public void cancelarPedido(int idPedido){

    }

    public void consultarPedido(int idPedido){

    }

    @Override
    public void consultarEntrega(int idPedido){

    }


}
