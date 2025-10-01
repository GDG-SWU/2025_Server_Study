package com.example.inflearn_text;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class InflearnTextApplication {

	public static void main(String[] args) {
		SpringApplication.run(InflearnTextApplication.class, args);
	}

}
