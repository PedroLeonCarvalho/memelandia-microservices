package com.example.memelandiaCategorias.repository;

import com.example.memelandiaCategorias.dto.CategoriaDto;
import com.example.memelandiaCategorias.model.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoriaMeme extends JpaRepository <CategoriaMeme, Long> {
    CategoriaDto findCategoriaById(Long id);
}
