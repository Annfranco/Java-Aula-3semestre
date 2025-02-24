package com.example;

public class Funcionario {
    private String codigoDoFuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria conta;

    public Funcionario() {
    }

    public Funcionario(String codigoDoFuncionario, String nome, String email, String endereco, String telefone, ContaBancaria conta) {
        this.codigoDoFuncionario = codigoDoFuncionario;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.conta = conta;
    }

    public String getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    public void setCodigoDoFuncionario(String codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Código: " + codigoDoFuncionario + 
               "\nNome: " + nome + 
               "\nEndereco: " + endereco + 
               "\nTelefone: " + telefone + 
               "\nEmail: " + email + 
               "\nConta Báncaria:" + conta;
    }

}
