package com.springboot.jpa.springbootjpacrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.springboot.jpa.springbootjpacrud.controller")
public class SpringBootJpaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaCrudApplication.class, args);
	}
}
