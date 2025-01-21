package com.john.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.john.todo.domain.Todo;
import com.john.todo.repositories.TodoRepository;

@Service
public class dbService {
	
	@Autowired
	private TodoRepository todoRepository;

	public void instanciaDataBase() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Todo t1 = new Todo(null, "Estudar", "Estudar spring boot", LocalDateTime.parse("25/03/2022 10:40", format),
				false);
		todoRepository.saveAll(Arrays.asList(t1));
	}
}
