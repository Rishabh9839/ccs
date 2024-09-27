package com.ccs.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CcsApplication {
	
	
	@GetMapping("/")
	public String home() {
		return "Hi Rishabh";
	}

	public static void main(String[] args) {
		SpringApplication.run(CcsApplication.class, args);
	}

}
