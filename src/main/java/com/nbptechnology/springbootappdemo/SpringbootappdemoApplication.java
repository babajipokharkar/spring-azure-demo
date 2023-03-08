package com.nbptechnology.springbootappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootappdemoApplication {

	@GetMapping("/message")
	public String message(){
		return "Congrats! Your app Deployed successfully";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootappdemoApplication.class, args);
	}

}
