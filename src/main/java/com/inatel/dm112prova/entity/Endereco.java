package com.inatel.dm112prova.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Endereco")
@Table(name="Endereco")
public class Endereco implements Serializable {

    private static final long serialversionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idEndereco;

    @ManyToOne
    @JoinColumn(name = "Clientes_idCliente")
    private Cliente cliente;

    @Column(length = 200, name = "logradouro")
    private String logradouro;

    @Column(length = 200)
    private String cidade;

    @Column(length = 200)
    private String estado;

    @Column(length = 8)
    private String cep;

    @Column(length = 80)
    private String pais;

}
