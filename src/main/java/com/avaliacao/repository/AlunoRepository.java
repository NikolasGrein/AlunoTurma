package com.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
}