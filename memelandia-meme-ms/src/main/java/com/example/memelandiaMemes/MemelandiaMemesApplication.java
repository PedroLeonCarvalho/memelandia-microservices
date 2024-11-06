package com.example.memelandiaMemes;

import com.example.memelandiaMemes.infra.CustomErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class MemelandiaMemesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemelandiaMemesApplication.class, args);
	}


}
