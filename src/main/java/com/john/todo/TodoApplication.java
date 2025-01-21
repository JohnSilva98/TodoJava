package com.john.todo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.john.todo.domain.Todo;
import com.john.todo.repositories.TodoRepository;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
	
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
	
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	@Override
	public void run(String... args) throws Exception {
		Todo t1 = new Todo(null, "Estudar", "Estudar spring boot", LocalDateTime.parse("25/03/2022 10:40", format), false);
		todoRepository.saveAll(Arrays.asList(t1));
		
	}

}
