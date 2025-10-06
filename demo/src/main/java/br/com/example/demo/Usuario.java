package br.com.example.demo;

public class Usuario {
    public String nome;

    public Usuario(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
