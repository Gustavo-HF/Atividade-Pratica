package com.recuperacao.recuperacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recuperacao.recuperacao.model.Professor;
/* Parte responsável pela view do programa, ela pegará todas as informações captadas do model 
 * pelo controller e mostrará diretamente para a página html.
 */
@Repository
public interface  ProfessorRepository extends JpaRepository<Professor, Long> {
    
}
