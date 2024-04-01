package com.inatel.dm112prova.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Pedidos")
@Table(name = "Pedidos")
public class Pedido implements Serializable {

    private static final long serialversionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long idPedido;

    @ManyToOne
    @JoinColumn(name = "Produtos_idProduto")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "Clientes_idCliente")
    private Cliente cliente;

    @Column(length = 200,name = "endereco_email")
    private String enderecoEmail;

    @Column(length = 200,name = "status_pedido")
    private String statusPedido;

    @Column(name = "quantidade")
    private Integer quantidade;

}
