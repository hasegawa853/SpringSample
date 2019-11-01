package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;
import lombok.ToString;

@SpringBootApplication
@ToString
public class SpringSampleApplication {
	String name;
	String place;
	public static void main(String[] args) {
		SpringApplication.run(SpringSampleApplication.class, args);
	}

}
