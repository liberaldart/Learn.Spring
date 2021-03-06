package com.curriculum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.eagree.data.repository.mysql")
public class TeachspringgradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachspringgradleApplication.class, args);
	}
}
