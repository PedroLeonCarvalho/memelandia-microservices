package com.example.memelandiaMemes.controller;

import com.example.memelandiaMemes.model.Meme;
import com.example.memelandiaMemes.service.ServicoMemelandia;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/memelandia")
public class ControllerMemelandia {

    private final ServicoMemelandia servicoMemelandia;


    public ControllerMemelandia(ServicoMemelandia servicoMemelandia) {
        this.servicoMemelandia = servicoMemelandia;
    }

    @GetMapping("/memes")
    public List<Meme> buscaMemes() {
        return servicoMemelandia.listaTodosMemes();
    }

    @PostMapping("/memes")
    public Meme novoMeme(@RequestBody Meme meme) {
        return servicoMemelandia.novoMeme(meme);
    }
}

