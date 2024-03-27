package com.inatel;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class H2Conexao {
    
    private String usuario = "sadm112";
    private String senha = "";

    

    

    public static void criarTabela(String tableName) throws SQLException, ClassNotFoundException{

        Class.forName("org.h2.Driver");
        String url = "\"jdbc:h2:c:\\test\\test\"";

        Connection connection = DriverManager.getConnection(url);

        System.out.println("Conectado com sucesso ao banco de dados");
    
        //String sql = "Create table Clientes (ID int primary key, name varchar(50), email varchar(50), status int)";

        Statement statement = connection.createStatement();

        String sql = "Create table @tableName (IdCliente int primary key, name varchar(50), email varchar(50), status int)";

        statement.execute(sql);

        System.out.println("Tabela de clientes criada");



    }
}
    

