package com.example.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController // Lets Java know MoviesApplication is a controller that has handlers for different HTTP endpoints
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

//	@GetMapping("/root") // makes the apiRoot method a get HTTP GET endpoint of "/"
//	public String apiRoot() {
//		return "Hello World!";
//	}
}
