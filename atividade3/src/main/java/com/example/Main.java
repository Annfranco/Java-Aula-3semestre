package com.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Marta", 58, 
        new Endereco("Rua Alameda", 6, "Brotas"));

        System.out.println(cliente.toString());
    }
}