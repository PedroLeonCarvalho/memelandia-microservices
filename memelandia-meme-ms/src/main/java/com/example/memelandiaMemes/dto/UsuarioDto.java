package com.example.memelandiaMemes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioDto {
    private Long id;
    private String nome;
    private String email;
    private Date dataCadastro;
}
