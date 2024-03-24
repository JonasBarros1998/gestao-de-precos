package com.fiap.gestaodeprecos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GestaoDePrecosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoDePrecosApplication.class, args);
	}

}
