package com.example.memelandiaCategorias.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class CategoriaMeme {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_categoria_meme")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "data_cadastro", nullable = false)
    private Date dataCadastro;

    @Column(name = "usuario_id")
    private Long usuario;

}
