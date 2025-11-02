package com.recuperacao.recuperacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/* Classe de armazenamento de dados, ela serve como construtor e como banco de dados para o
 * sistema no modelo MVC
 */
@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private Long id;

    private String name;
    private String areaDeEnsino;
    private boolean isEfetivo;
    private double wage;
    private int yearsTeaching;

    public Professor(String areaDeEnsino, boolean isEfetivo, String name, double wage, int yearsTeaching) {
        this.areaDeEnsino = areaDeEnsino;
        this.isEfetivo = false;
        this.name = name;
        this.wage = wage;
        this.yearsTeaching = yearsTeaching;
    }

    public Professor(){
        
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

    public String getAreaDeEnsino() {
        return areaDeEnsino;
    }

    public void setAreaDeEnsino(String areaDeEnsino) {
        this.areaDeEnsino = areaDeEnsino;
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
