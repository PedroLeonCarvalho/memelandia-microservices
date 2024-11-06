package com.example.memelandiaCategorias.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

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
