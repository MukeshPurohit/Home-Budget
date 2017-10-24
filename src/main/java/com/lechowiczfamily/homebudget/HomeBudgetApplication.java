package com.lechowiczfamily.homebudget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HomeBudgetApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeBudgetApplication.class, args);
	}

	@RequestMapping("/")
	public String sayHello(){
		return "Hello World!";
	}
}
