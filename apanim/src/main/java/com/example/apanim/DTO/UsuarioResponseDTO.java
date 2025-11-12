package com.example.apanim.DTO;

import com.example.apanim.Enum.Sexo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDTO {
    private Long id;
    private String nome;
    private Sexo sexo;
    private String cpf;
    private String telefone;
    private String email;
    private String cep;
    private String logradouro;
    private String bairro;

    public UsuarioResponseDTO() {
    }

    public UsuarioResponseDTO(Long id, String nome, Sexo sexo, String cpf, String telefone, String email, String cep,
            String logradouro, String bairro) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
    }

}
