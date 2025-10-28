package com.recuperacao.recuperacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private Long id;

    private String name;
    private String cpf;
    private boolean isEfetivo;
    private double wage;
    private int yearsTeaching;

    public Professor(String cpf, boolean isEfetivo, String name, double wage, int yearsTeaching) {
        this.cpf = cpf;
        this.isEfetivo = false;
        this.name = name;
        this.wage = wage;
        this.yearsTeaching = yearsTeaching;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isIsEfetivo() {
        return isEfetivo;
    }

    public void setIsEfetivo(boolean isEfetivo) {
        this.isEfetivo = isEfetivo;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }




    
}
