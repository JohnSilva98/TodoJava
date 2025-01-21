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
		Todo t2 = new Todo(null, "Ler", "ler café com Deus pai", LocalDateTime.parse("22/05/2025 11:30", format),
				true);
		Todo t3 = new Todo(null, "Academia", "Treino ABC", LocalDateTime.parse("23/04/2023 09:00", format),
				false);
		Todo t4 = new Todo(null, "Estudar", "Estudar frontend", LocalDateTime.parse("25/03/2022 10:40", format),
				true);
		todoRepository.saveAll(Arrays.asList(t1,t2,t3,t4));
	}
}
