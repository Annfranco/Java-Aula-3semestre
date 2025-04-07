package com.senai.atividade.api_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class Desenvolvedor {

    @GetMapping
    public String desenvolvedor() {
        return "Rayanne Franco";
    }
}
