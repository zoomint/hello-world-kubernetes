package com.zoomint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldKubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldKubernetesApplication.class, args);
	}

	@GetMapping("/greeting")
	public String getGreeting() {
		return "Hello world";
	}
}
