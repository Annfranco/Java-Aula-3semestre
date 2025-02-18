package com.example;

public class Veiculo {
    private String placa;
    private String cor;
    private int numeroDePassageiros;
    private double capacidadeDeTanque;
    private double velocidadeMaxima;
    private double consumoMedio;
    
    public Veiculo(String placa, String cor, int numeroDePassageiros, double capacidadeDeTanque,
            double velocidadeMaxima, double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeDeTanque = capacidadeDeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public double getCapacidadeDeTanque() {
        return capacidadeDeTanque;
    }

    public void setCapacidadeDeTanque(double capacidadeDeTanque) {
        this.capacidadeDeTanque = capacidadeDeTanque;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    
}
