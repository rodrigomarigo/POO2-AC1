package com.example.ac1.Controller;

import java.util.List;

import javax.validation.Valid;

import com.example.ac1.Entity.Funcionario;
import com.example.ac1.Service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/app")
public class FuncionarioController {
    @Autowired  
    private FuncionarioService service;

    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){
        ModelAndView mv = new ModelAndView("funcionarios");

        mv.addObject("funcionarios", service.getFuncionarios());

        return mv;
    }

    @PostMapping("/funcionarios")
    public ModelAndView todoslivrosForm(@ModelAttribute final @Valid Funcionario funcionario, BindingResult bindingResult) {
        //confere se não tem erros nos dados inseridos
        if (!bindingResult.hasErrors()) {
            //se nao tiver, adiciona no banco pelo service
            service.addFuncionario(funcionario);
        }
        else{
            System.out.print("Erro nos dados inseridos");
        }

        final ModelAndView mv = new ModelAndView("funcionarios");

        final List<Funcionario> funcionarios = service.getFuncionarios();

        mv.addObject("funcionarios", funcionarios); 

        return mv;
    }

}