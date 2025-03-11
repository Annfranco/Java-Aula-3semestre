package br.com.senai.projeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bemvindo")
public class BemVindo {

    @RequestMapping
    public String bemVindo() {
        return "Bem-vindo ao Projeto! - Rayanne!";
    }
}
