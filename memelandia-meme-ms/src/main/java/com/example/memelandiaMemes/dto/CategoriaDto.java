package com.example.memelandiaMemes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
public class CategoriaDto {

    private Long id;

    private String nome;


    private String descricao;

    private Date dataCadastro;

    private Long usuario;
}
