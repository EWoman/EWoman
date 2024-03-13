package com.generation.ewoman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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
	private String nome_categoria;
	
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

	public String getNome_categoria() {
		return nome_categoria;
	}

	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

}
