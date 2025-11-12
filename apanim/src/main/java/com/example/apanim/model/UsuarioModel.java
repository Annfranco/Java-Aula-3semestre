package com.example.apanim.model;

import com.example.apanim.Enum.Sexo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tab_usuarios")
public class UsuarioModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(unique = true)
    private String cpf;

    private String telefone;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    private String cep;
    private String logradouro;
    private  String bairro;

    public UsuarioModel() {
    }

    public UsuarioModel(Long id, String nome, Sexo sexo, String cpf, String telefone, String email, String senha, String cep, String logradouro, String bairro) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
    }

}
