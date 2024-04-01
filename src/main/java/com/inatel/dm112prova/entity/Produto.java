package com.inatel.dm112prova.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Produtos")
public class Produto implements Serializable {

    private static final long serialversionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long IdProduto;

    @Column(length = 200,name = "nome")
    private  String nome;

}
