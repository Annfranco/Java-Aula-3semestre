package com.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Vivian", 40, 
            new Pet("Tata", 8, "Pug"));

        System.out.println(cliente.toString());
    }
}