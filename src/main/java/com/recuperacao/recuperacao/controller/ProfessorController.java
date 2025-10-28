package com.recuperacao.recuperacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.recuperacao.recuperacao.repository.ProfessorRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/")
    public String listarProfessores(Model model,  @RequestParam(defaultValue= "0") int page) {
        int pageSize = 3;
        
        
        return "index";
    }
    
}
