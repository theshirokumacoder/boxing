package com.shirokuma.aws.argocd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/boxing")
public class SpringbootAwsArgocdAppApplication {
	private List<Boxer> boxers = new ArrayList<>();
	
	@PostMapping("/addBoxer")
	public Boxer addBook(@RequestBody Boxer boxer) {
		boxers.add(boxer);
		return boxer;
	}
	
	@GetMapping("/boxers")
	public List<Boxer> getBooks() {
		return boxers;
	}
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		return "Welcome to Shirokuma Boxing!!!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsArgocdAppApplication.class, args);
	}

}
