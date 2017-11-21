package com.hlaing.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hlaing.model.Animal;

@Service
@Profile("animal-dev")
public class Elephant implements Animal {

	@Override
	public String getMessage() {
		return "Hello Elephant";
	}

}
