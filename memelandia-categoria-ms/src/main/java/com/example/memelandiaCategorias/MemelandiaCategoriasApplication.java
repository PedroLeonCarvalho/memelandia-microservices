package com.example.memelandiaCategorias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MemelandiaCategoriasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemelandiaCategoriasApplication.class, args);
	}

}
