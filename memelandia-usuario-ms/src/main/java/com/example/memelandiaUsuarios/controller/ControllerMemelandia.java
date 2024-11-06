package com.example.memelandiaUsuarios.controller;

import com.example.memelandiaUsuarios.model.Usuario;
import com.example.memelandiaUsuarios.model.UsuarioDto;
import com.example.memelandiaUsuarios.repository.RepositorioUsuario;
import com.example.memelandiaUsuarios.service.ServicoMemelandia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memelandia")
public class ControllerMemelandia {
    @Autowired
    private ServicoMemelandia servicoMemelandia;


    @GetMapping("/usuarios")
    public List<Usuario> buscaUsuarios() {
        return servicoMemelandia.listaTodosUsuarios();
    }

    @PostMapping("/usuarios")
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return servicoMemelandia.novoUsuario(usuario);
    }

    @GetMapping("/{id}")
    public UsuarioDto findUsuarioById(@PathVariable Long id) throws RuntimeException {
        return servicoMemelandia.findById(id);

    }
}

