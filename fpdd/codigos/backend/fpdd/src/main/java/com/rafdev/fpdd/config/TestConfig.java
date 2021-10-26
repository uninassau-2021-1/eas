package com.rafdev.fpdd.config;

import java.text.ParseException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class TestConfig {

	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		
		return true;
	}
	
}
