package com.sampa.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootSimpleRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleRestApplication.class, args);
	}
}
