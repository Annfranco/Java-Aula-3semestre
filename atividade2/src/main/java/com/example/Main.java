package com.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria", 35, "789.258.987-65", "Rua Alameda", "719999-8888");
        System.out.println(cliente.toString());

        Veiculo veiculo = new Veiculo("B87RE", "Vermelho", 6, 500, 250, 260);
        System.out.println(veiculo.toString());
    }
}