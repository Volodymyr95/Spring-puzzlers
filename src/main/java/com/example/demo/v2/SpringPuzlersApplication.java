package com.example.demo.v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPuzlersApplication {


	@Bean
	public RedApple redApple() {
		return new RedApple();
	}

	@Bean
	public RedSweetApple redSweetApple() {
		return new RedSweetApple();
	}

	@Bean
	public Bucket bucket() {
		return new Bucket();
	}




	public static void main(String[] args) {
		SpringApplication.run(SpringPuzlersApplication.class, args);
	}

}
