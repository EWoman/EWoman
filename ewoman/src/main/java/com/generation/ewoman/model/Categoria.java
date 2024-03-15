package com.generation.ewoman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

//Anotação para criar entidade tabela e nomear nome respectivamente
@Entity
@Table(name = "tb_categoria") //Tabela
public class Categoria {
	
	//ID da categoria - chave primária
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Nome da categoria
	@NotNull(message = "Nome obrigatório")
	@Size(min = 5, max = 45, message = "O nome deve ter no mínimo 5 e no máximo 45 caracteres!")
	private String nomeCategoria;
	
	//Nível
	@NotNull(message = "Nível obrigatório")
	@Size(min = 5, max = 45, message = "O nível deve ter no mínimo 5 e no máximo 45 caracteres!")
	private String nivel;

	//Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

}
