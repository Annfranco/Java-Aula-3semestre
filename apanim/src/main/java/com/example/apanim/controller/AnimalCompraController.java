package com.example.apanim.controller;

import com.example.apanim.DTO.AnimalCompraCadastroDTO;
import com.example.apanim.DTO.AnimalCompraResponseDTO;
import com.example.apanim.service.AnimalCompraService;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/compra") // <-- Endpoint Específico!
public class AnimalCompraController {

    private final AnimalCompraService animalCompraService;

    public AnimalCompraController(AnimalCompraService animalCompraService) {
        this.animalCompraService = animalCompraService;
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody AnimalCompraCadastroDTO dto) {
        animalCompraService.salvar(dto, dto.getVendedorId()); 
        
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Animal à venda cadastrado com sucesso."));
    }

    @GetMapping
    public ResponseEntity<List<AnimalCompraResponseDTO>> listarTodos() {
        return ResponseEntity.ok(animalCompraService.listarTodos());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(
            @PathVariable Long id, 
            @Valid @RequestBody AnimalCompraCadastroDTO dto) {
        
        animalCompraService.atualizar(id, dto);
        return ResponseEntity.ok(Map.of("mensagem", "Animal atualizado com sucesso."));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<Object, String>> excluir(@PathVariable Long id) {
        animalCompraService.excluir(id);
        return ResponseEntity.ok(Map.of("mensagem", "Animal excluido com sucesso."));    
    }
}