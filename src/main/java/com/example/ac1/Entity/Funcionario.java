package com.example.ac1.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
public class Funcionario implements Serializable {  
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @NonNull
    @GeneratedValue(strategy=GenerationType.AUTO) //gera a chave automaticamente
    @Column(name="id")
    private int id;

    @NonNull
    @Size(min=2, max=50) //limita o tamanho da String 
    private String nome;

    @NonNull
    @Size(min=2, max=50)
    private String cargo;

    @NonNull
    @Min(600) // define os valores max e min
    @Max(50000)
    private double salario;

    @NonNull
    @Size(min=2, max=50)
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