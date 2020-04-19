package com.example.ac1.Service;

import java.util.List;

import com.example.ac1.Entity.Funcionario;
import com.example.ac1.Repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> getFuncionarios(){
        return repository.findAll();
    }

    //adiciona um funcionario no banco
    public void addFuncionario(Funcionario f){

        repository.saveAndFlush(f);
    }
}   