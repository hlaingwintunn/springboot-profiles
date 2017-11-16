package com.hlaing.springbootProfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hlaing.springbootProfiles.service", "com.hlaing.springbootProfiles.config"})
public class SpringbootProfilesApplication {	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProfilesApplication.class, args);
	}
}
