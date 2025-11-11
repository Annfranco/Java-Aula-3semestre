package com.example.apanim.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apanim.DTO.AnimalPerdidoCadastroDTO;
import com.example.apanim.DTO.AnimalPerdidoResponseDTO;
import com.example.apanim.model.AnimalPerdido;
import com.example.apanim.service.AnimalPerdidoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/animalPerdido")
public class AnimalPerdidoController {

    private final AnimalPerdidoService animalPerdidoService;

    public AnimalPerdidoController(AnimalPerdidoService animalPerdidoService) {
        this.animalPerdidoService = animalPerdidoService;
    }

    @PostMapping
    public ResponseEntity<AnimalPerdidoResponseDTO> cadastrar(
            @Valid @RequestBody AnimalPerdidoCadastroDTO dto) {
        
        Long usuarioId = dto.getUsuarioId(); 

        AnimalPerdido animalSalvo = animalPerdidoService.salvarAnimalPerdido(dto, usuarioId);
        AnimalPerdidoResponseDTO responseDTO = animalPerdidoService.toDTO(animalSalvo);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    @GetMapping
    public ResponseEntity<List<AnimalPerdidoResponseDTO>> listarTodos() {
        List<AnimalPerdidoResponseDTO> lista = animalPerdidoService.listarTodosAnimais();
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<AnimalPerdidoResponseDTO> atualizar(
            @PathVariable Long id, 
            @Valid @RequestBody AnimalPerdidoCadastroDTO dto) {

        AnimalPerdido animalAtualizado = animalPerdidoService.atualizar(id, dto);
        AnimalPerdidoResponseDTO responseDTO = animalPerdidoService.toDTO(animalAtualizado);
        
        return ResponseEntity.ok(responseDTO);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        animalPerdidoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}