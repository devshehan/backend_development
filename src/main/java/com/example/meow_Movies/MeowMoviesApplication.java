package com.example.meow_Movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MeowMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeowMoviesApplication.class, args);
	}

	@GetMapping("/root")
	public String helloIndex(){
		return "Hello world";
	}
}
