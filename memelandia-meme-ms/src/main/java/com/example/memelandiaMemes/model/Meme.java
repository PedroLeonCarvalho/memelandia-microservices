package com.example.memelandiaMemes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
@Getter
@Setter
@Entity
public class Meme {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_meme")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "data_cadastro", nullable = false)
    private Date dataCadastro;


    @Column(name = "categoria_meme_id")
    private Long categoriaMeme;


    @Column(name = "usuario_id")
    private Long usuario;

    public Meme() {}

}

