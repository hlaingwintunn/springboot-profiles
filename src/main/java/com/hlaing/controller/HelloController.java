package com.hlaing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
//	@Autowired
//	private Animal animal;
	
	@GetMapping("/")
	public String getMessage() {
		return "Hello Message";
	}

}
