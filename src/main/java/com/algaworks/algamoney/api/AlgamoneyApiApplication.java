package com.algaworks.single-app.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.algaworks.single-app.api.config.property.single-appApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(single-appApiProperty.class)
public class single-appApiApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(single-appApiApplication.class, args);
	}
}
