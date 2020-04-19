package com.example.ac1.Repository;

import java.util.HashMap;

import com.example.ac1.Entity.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{

}