package com.example;

public class Cliente {
    // nome, email e senha.

    private String nome;
    private String email;
    private int senha;

    public Cliente() {
    }

    public Cliente(String nome, String email, int senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nEmail: " + email + 
               "\nSenha: " + senha;
    }   
    
}
