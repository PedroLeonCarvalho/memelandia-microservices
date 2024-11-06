package com.example.memelandiaMemes.infra;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        HttpStatus status = HttpStatus.valueOf(response.status());

        if (status == HttpStatus.INTERNAL_SERVER_ERROR) {
            // Retorna uma exceção específica para erro interno
            return new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro interno no serviço de categorias: Categoria não existe.");
        }

        // Decodificação padrão para outros erros
        return new ResponseStatusException(status, "Erro ao acessar o serviço de categorias.");
    }
}