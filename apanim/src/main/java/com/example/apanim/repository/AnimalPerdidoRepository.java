package com.example.apanim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.example.apanim.model.AnimalPerdido;

public interface AnimalPerdidoRepository extends JpaRepository<AnimalPerdido, Long> {
    Optional<AnimalPerdido> findByNome(String nome);
    Optional<AnimalPerdido> findByNomeAndUsuarioId(String nome, Long usuarioId);
}

