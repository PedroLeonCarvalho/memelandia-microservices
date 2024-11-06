package com.example.memelandiaUsuarios.service;

import com.example.memelandiaUsuarios.model.Usuario;
import com.example.memelandiaUsuarios.model.UsuarioDto;
import com.example.memelandiaUsuarios.repository.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Component
public class ServicoMemelandia {


    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario novoUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    public List<Usuario> listaTodosUsuarios() {
        return repositorioUsuario.findAll();
    }

    public UsuarioDto findById(Long id) {
        var user= repositorioUsuario.findUsuarioById(id);
        if ( user ==null ) {
            throw new RuntimeException();
        }
        UsuarioDto dto = new UsuarioDto(user.getId(), user.getNome(), user.getEmail(), user.getDataCadastro());
        return dto;

    }
}

