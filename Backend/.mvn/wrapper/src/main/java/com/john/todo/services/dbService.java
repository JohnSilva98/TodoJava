package com.john.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.john.todo.domain.Todo;
import com.john.todo.repositories.TodoRepository;

@Service
public class dbService {
	
	@Autowired
	private TodoRepository todoRepository;

	public void instanciaDataBase() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat();
		Todo t1 = new Todo(null, "Estudar", "Estudar spring boot", sdf.parse("25/03/2022"),
				false);
		Todo t2 = new Todo(null, "Ler", "ler café com Deus pai", sdf.parse("22/05/2025 "),
				true);
		Todo t3 = new Todo(null, "Academia", "Treino ABC", sdf.parse("23/04/2023"),
				false);
		Todo t4 = new Todo(null, "Estudar", "Estudar frontend", sdf.parse("25/03/2022"),
				true);
		todoRepository.saveAll(Arrays.asList(t1,t2,t3,t4));
	}
}
