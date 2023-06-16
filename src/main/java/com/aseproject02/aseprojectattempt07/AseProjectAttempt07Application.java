package com.aseproject02.aseprojectattempt07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.aseproject02")
public class AseProjectAttempt07Application {

	public static void main(String[] args) {
		SpringApplication.run(AseProjectAttempt07Application.class, args);
	}

}
