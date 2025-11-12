package com.example.apanim.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apanim.model.AnimalPerdido;

@Repository
public interface AnimalPerdidoRepository extends JpaRepository<AnimalPerdido, Long> {
    Optional<AnimalPerdido> findByNome(String nome);
    Optional<AnimalPerdido> findByNomeAndUsuarioId(String nome, Long usuarioId);
}
