package br.com.example.api.controller;

import br.com.example.api.repository.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.example.api.model.Pessoa;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class Controle {

    @Autowired
    private Repository acao;

    @GetMapping("/api")
    public List<Pessoa> selecionar() {
        return acao.findAll();
    }

    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa obj) {
        return acao.save(obj);
    }

    @PostMapping("/api/{codigo}")
    public Pessoa selecionarPeloCodigo(@PathVariable int codigo) {
        return acao.findByCodigo(codigo);
    }

    @PutMapping("/api") 
    public Pessoa editar(@RequestBody Pessoa obj) {
        return acao.save(obj);
    }

    @DeleteMapping("/api/{codigo}")
    public void remover(@PathVariable int codigo) {
        Pessoa obj = selecionarPeloCodigo(codigo);
        acao.delete(obj);
    }

    @GetMapping
    public String mensagem() {
        return "Hello World!";    
    }

    @GetMapping("/boasVindas/{nome}") 
    public String boasVindas(@PathVariable String nome) {
        return "Seja bem vindo(a)" + " " + nome + "!";
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p) {
        return p;
    }


    
}
