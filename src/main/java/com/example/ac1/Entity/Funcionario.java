package com.example.ac1.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable {  
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private String setor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario [cargo=" + cargo + ", id=" + id + ", nome=" + nome + ", salario=" + salario + ", setor="
                + setor + "]";
    }

    



}