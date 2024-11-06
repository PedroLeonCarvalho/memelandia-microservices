package com.example.memelandiaMemes.clients;

import com.example.memelandiaMemes.dto.CategoriaDto;
import com.example.memelandiaMemes.dto.UsuarioDto;
import com.example.memelandiaMemes.infra.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "memelandia-categoria-ms" , url = "http://localhost:8084/memelandia/", configuration = FeignConfig.class)
public interface CategoriaClient {

    @GetMapping("/{id}")
    CategoriaDto buscaCategoriaById(@PathVariable("id") Long id);
}
