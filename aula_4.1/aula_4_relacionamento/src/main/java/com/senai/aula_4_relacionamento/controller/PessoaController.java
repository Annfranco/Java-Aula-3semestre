package com.senai.aula_4_relacionamento.controller;

import com.senai.aula_4_relacionamento.model.Pessoa;
import com.senai.aula_4_relacionamento.repository.PessoaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping
    public List<Pessoa> listarTodos(){
        return pessoaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
    }

    @PutMapping
    // quando se tem apenas uma linha abaixo do if não precisa colocar chaves
    // só é obrigatorio quando tem duas ou mais linhas
    public ResponseEntity<Pessoa> atualizar(@RequestBody Pessoa pessoa) {
        if (pessoaRepository.existsById(pessoa.getId()))
            pessoaRepository.save(pessoa);
        return ResponseEntity.ok().body(pessoa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        pessoaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
