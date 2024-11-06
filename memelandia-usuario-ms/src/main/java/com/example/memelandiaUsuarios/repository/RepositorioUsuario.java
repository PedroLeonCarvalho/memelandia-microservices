package com.example.memelandiaUsuarios.repository;

import com.example.memelandiaUsuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

    Usuario findUsuarioById(Long id);
}
