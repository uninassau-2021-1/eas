package com.rafdev.fpdd.config;

import java.text.ParseException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("teste")
public class DevConfig {

	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		
		return true;
	}
	
}
