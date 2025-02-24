package com.example;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String numeroDaConta;
    private String tipoDaConta;
    private double saldoAtual;
    private double limiteDisponivel;

    public ContaBancaria() {
    }

    public ContaBancaria(String agencia, String banco, double limiteDisponivel, String numeroDaConta, double saldoAtual, String tipoDaConta) {
        this.agencia = agencia;
        this.banco = banco;
        this.limiteDisponivel = limiteDisponivel;
        this.numeroDaConta = numeroDaConta;
        this.saldoAtual = saldoAtual;
        this.tipoDaConta = tipoDaConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "\nBanco: " + banco + 
               "\nAgencia: " + agencia + 
               "\nNúmero Da Conta: " + numeroDaConta + 
               "\nTipo Da Conta: " + tipoDaConta + 
               "\nSaldo Atual: " + saldoAtual + 
               "\nLimite Disponivel: " + limiteDisponivel;
    }

}
