package com.john.todo.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Todo {

	private Integer id;
	private String titulo;
	private String descricao;
	private LocalDateTime dataFinal;
	private boolean finalizado = false;

	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Todo(Integer id, String titulo, String descricao, LocalDateTime dataFinal, boolean finalizado) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataFinal = dataFinal;
		this.finalizado = finalizado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDateTime dataFinal) {
		this.dataFinal = dataFinal;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(id, other.id);
	}

}
