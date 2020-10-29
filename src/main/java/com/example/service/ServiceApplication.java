package com.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceApplication {

	@GetMapping("/")
	public String getMessage() {
		return "Hi from springboot";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

}
