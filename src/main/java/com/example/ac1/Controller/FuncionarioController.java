package com.example.ac1.Controller;

import javax.validation.Valid;

import com.example.ac1.Entity.Funcionario;
import com.example.ac1.Service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {
    @Autowired  
    private FuncionarioService service;

    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){
        ModelAndView mv = new ModelAndView("funcionarios");

        mv.addObject("funcionarios", service.getFuncionarios());

        return mv;
    }
    
    @PostMapping("/novoFuncionario")
	public String checkFuncionario(@Valid Funcionario funcionario, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            System.out.print("Algo deu errado ao cadastrar");
        }
        else{
            service.addFuncionario(funcionario);
        }
		return "redirect:/funcionarios";
	}
}