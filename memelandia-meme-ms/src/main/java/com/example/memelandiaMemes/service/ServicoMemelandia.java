package com.example.memelandiaMemes.service;

import com.example.memelandiaMemes.clients.CategoriaClient;
import com.example.memelandiaMemes.clients.UsuarioClient;
import com.example.memelandiaMemes.dto.CategoriaDto;
import com.example.memelandiaMemes.dto.UsuarioDto;
import com.example.memelandiaMemes.model.Meme;
import com.example.memelandiaMemes.repository.RepositorioMeme;
import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicoMemelandia {
private  final RepositorioMeme repositorioMeme;
private  final UsuarioClient usuarioClient;
private  final CategoriaClient categoriaClient;

    public ServicoMemelandia(RepositorioMeme repositorioMeme, UsuarioClient usuarioClient, CategoriaClient categoriaClient) {
        this.repositorioMeme = repositorioMeme;
        this.usuarioClient = usuarioClient;
        this.categoriaClient = categoriaClient;
    }

    public Meme novoMeme(Meme meme) {
         UsuarioDto dto = usuarioClient.buscaUserById(meme.getUsuario());
        if (dto == null) {throw new RuntimeException("Usuário não cadastrado, insira um usuário valido");
   }
        CategoriaDto categoriaDto;
        try {
            categoriaDto = categoriaClient.buscaCategoriaById(meme.getCategoriaMeme());
        } catch (FeignException e) {
            if (e.status() == HttpStatus.NOT_FOUND.value()) {
                throw new RuntimeException("Essa categoria não existe");
            } else if (e.status() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                throw new RuntimeException("Serviço de categorias está temporariamente indisponível. Tente novamente mais tarde.");
            } else {
                throw new RuntimeException("Erro inesperado ao buscar categoria: " + e.getMessage());
            }
        }

        // Salva o meme se o usuário e a categoria forem válidos
        return repositorioMeme.save(meme);
    }
//        CategoriaDto categoriaDto = categoriaClient.buscaCategoriaById(meme.getCategoriaMeme());
//        return repositorioMeme.save(meme);
//    }

    public List<Meme> listaTodosMemes() {
        return repositorioMeme.findAll();
    }

}
