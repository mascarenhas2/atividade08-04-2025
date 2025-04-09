package com.example.atividade.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Ola! Seja bem vindo ao banco de dados de funcionarios!";

    }
    @GetMapping("/dev")
    public String getDev(){
        return "Desenvolvedor:Caio Mascarenhas";
    }

}