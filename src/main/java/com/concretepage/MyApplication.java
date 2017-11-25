package com.concretepage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;
@SpringBootApplication
public class MyApplication {
	private static final Logger logger = LoggerFactory.getLogger(MyApplication.class);	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(MyApplication.class);
		ConfigurableEnvironment env = new StandardEnvironment();
		env.setDefaultProfiles("dev" , "animal_dev");
		application.setEnvironment(env);
		application.run(args);
		logger.debug("--Application Started--");		
    }       
}            