package com.example.memelandiaMemes.clients;

import com.example.memelandiaMemes.dto.UsuarioDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "memelandia-usuario-ms" , url = "http://localhost:8082/memelandia/")
public interface UsuarioClient {

    @GetMapping("/{id}")
    UsuarioDto buscaUserById(@PathVariable("id") Long id);
}
