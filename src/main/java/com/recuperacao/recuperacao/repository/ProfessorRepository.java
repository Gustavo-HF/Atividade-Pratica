package com.recuperacao.recuperacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recuperacao.recuperacao.model.Professor;

@Repository
public interface  ProfessorRepository extends JpaRepository<Professor, Long> {
    
}
