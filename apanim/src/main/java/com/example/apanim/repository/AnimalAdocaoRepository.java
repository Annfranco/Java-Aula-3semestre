package com.example.apanim.repository;

import com.example.apanim.model.AnimalAdocao;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AnimalAdocaoRepository extends JpaRepository<AnimalAdocao, Long> {
    Optional<AnimalAdocao> findByNome(String nome);
    Optional<AnimalAdocao> findByNomeAndUsuarioId(String nome, Long usuarioId);
}
