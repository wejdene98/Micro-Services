package com.example.annoncementService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AnnoncementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnoncementServiceApplication.class, args);
	}

}
