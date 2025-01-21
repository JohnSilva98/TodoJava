package com.john.todo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.john.todo.services.dbService;

@Configuration
@Profile("test")
public class testConfig {
	
	@Autowired
	private dbService dbService;
	
	@Bean
	public boolean instancia() {
		this.dbService.instanciaDataBase();
		return true;
	}

}
