package com.inatel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Cliente {

    private String nome;
    private int id;
    private String email;
    private boolean status;

    public void cadastrarCliente(String nome,String email,boolean status){

    }

    public void alterarCliente(int id,String nome,String email,boolean status){

    }

    public void deletarCliente(int id){

    }

    public boolean alterarStatus(){
        return true;
    }

}
