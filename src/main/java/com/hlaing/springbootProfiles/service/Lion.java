package com.hlaing.springbootProfiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("animal-prod")
public class Lion implements Animal {

	@Override
	public String getMessage() {
		return "Hello Lion!";
	}

}
