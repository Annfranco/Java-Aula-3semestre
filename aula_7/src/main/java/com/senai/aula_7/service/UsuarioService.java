package com.senai.aula_7.service;

import com.senai.aula_7.exception.EmailJaCadastradoException;
import com.senai.aula_7.model.Usuario;
import com.senai.aula_7.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario salvar(@Valid Usuario usuario) {
        if(usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new EmailJaCadastradoException("Usuário já cadastrado.");
        }
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(@Valid Usuario usuario) {
        Usuario usuarioAtualizar = usuarioRepository.findById(usuario.getId())
                .orElseThrow(() -> new IllegalArgumentException(("Usuário não encontrado.")));

        usuarioAtualizar.setNome(usuario.getNome());
        usuarioAtualizar.setEmail(usuario.getEmail());
        usuarioAtualizar.setSenha(usuario.getSenha());

        return usuarioRepository.save(usuarioAtualizar);
    }

    public void excluir(Long id) {
        Usuario usuarioExcluir = usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado."));

        usuarioRepository.delete(usuarioExcluir);
    }
}