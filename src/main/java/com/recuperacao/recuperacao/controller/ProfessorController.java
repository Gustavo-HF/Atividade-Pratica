package com.recuperacao.recuperacao.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.recuperacao.recuperacao.repository.ProfessorRepository;
import com.recuperacao.recuperacao.model.Professor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/")
    public String listarProfessores(Model model,  @RequestParam(defaultValue= "0") int page) {
        int pageSize = 3;
        
        Pageable pageConfiguration = PageRequest.of(page, pageSize);
        Page<Professor> professorPage = professorRepository.findAll(pageConfiguration);

        model.addAttribute("professorPage", professorPage);
        model.addAttribute("newProfessor", new Professor());
        
        return "index";
    }

    @PostMapping("/adicionar")
    public String adicionarProfessor(@ModelAttribute Professor professor) {
        
        professorRepository.save(professor);
        return "redirect:/";
    }

    @PostMapping("/excluir")
    public String excluirProfessor(@RequestParam Long id) {

        professorRepository.deleteById(id);
        return "redirect:/";
    }

    @PostMapping("/efetivo")
    public String getIsEfetivo(@RequestParam Long id) {
        Professor professor = professorRepository.findById(id).orElse(null);
        if(professor != null ){
            professor.setIsEfetivo(true);
            professorRepository.save(professor);
        }
        
        return "redirect:/";
    }
    
    
    
    
}
