package com.hlaing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.hlaing.model", "com.hlaing.controller"})
public class SpringbootProfilesApplication {	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProfilesApplication.class, args);
	}
}
