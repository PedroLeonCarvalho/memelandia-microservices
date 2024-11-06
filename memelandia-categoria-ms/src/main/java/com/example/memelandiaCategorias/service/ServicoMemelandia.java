package com.example.memelandiaCategorias.service;

import com.example.memelandiaCategorias.dto.CategoriaDto;
import com.example.memelandiaCategorias.model.CategoriaMeme;
import com.example.memelandiaCategorias.repository.RepositorioCategoriaMeme;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicoMemelandia {

    private  final RepositorioCategoriaMeme repositorioCategoriaMeme;

    public ServicoMemelandia(RepositorioCategoriaMeme repositorioCategoriaMeme) {
        this.repositorioCategoriaMeme = repositorioCategoriaMeme;
    }

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return repositorioCategoriaMeme.save(categoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return repositorioCategoriaMeme.findAll();
    }

    public CategoriaDto findById(Long id) {

        var categoria= repositorioCategoriaMeme.findCategoriaById(id);

        if ( categoria ==null ) {
            throw new RuntimeException("Categoria não existe");
        }
        CategoriaDto dto = new CategoriaDto(
                categoria.getId(),
                categoria.getNome(),
                categoria.getDescricao(),
                categoria.getDataCadastro(),
                categoria.getUsuario());

        return dto;

    }

    }



