package com.generation.ewoman.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.ewoman.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllByNivelContainingIgnoreCase(@Param("nivel") String nivel);

}
