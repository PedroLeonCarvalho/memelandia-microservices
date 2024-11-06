package com.example.memelandiaCategorias.controller;

import com.example.memelandiaCategorias.dto.CategoriaDto;
import com.example.memelandiaCategorias.model.CategoriaMeme;
import com.example.memelandiaCategorias.service.ServicoMemelandia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/memelandia")
public class ControllerMemelandia {


    private  final ServicoMemelandia servicoMemelandia;

    public ControllerMemelandia(ServicoMemelandia servicoMemelandia) {
        this.servicoMemelandia = servicoMemelandia;
    }

    @GetMapping("/categorias")
    public List<CategoriaMeme> buscaCategorias() {
        return servicoMemelandia.listaTodasCategorias();
    }

    @PostMapping("/categorias")
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return servicoMemelandia.novaCategoriaMeme(categoriaMeme);
    }

    @GetMapping("/{id}")
    public CategoriaDto findCategoriaById(@PathVariable Long id) throws RuntimeException {
        return servicoMemelandia.findById(id);

    }

}
