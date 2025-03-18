package com.senai.aula_1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tab_funcionario")
@Data //lombok cria o construtor vazio, construtor, get e set, e toString
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    private String matricula;
    private String email;

}
