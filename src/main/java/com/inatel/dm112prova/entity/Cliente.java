package com.inatel.dm112prova.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Clientes")
@Table(name="Clientes")
public class Cliente implements Serializable {

    private static final long serialversionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idCliente;

    @Column(length = 200)
    private String email;

    @Column(length = 200)
    private String status;

    @Column(length = 200)
    private String nome;

}
