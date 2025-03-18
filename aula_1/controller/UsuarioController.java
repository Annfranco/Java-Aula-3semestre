package com.senai.aula_1.controller;

import com.senai.aula_1.model.Usuario;
import com.senai.aula_1.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/salvar")
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/buscar/{email}")
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@PathVariable String email) {
        Usuario usuario = usuarioService.buscarUsuarioPorEmail(email);
        return ResponseEntity.ok(usuario);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario) {
        usuarioService.atualizarUsuario(usuario);
        return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletarUsuarioPorId(@RequestParam Long id) {
        usuarioService.deletarUsuarioPorId(id);
        return ResponseEntity.noContent().build();
    }

}
