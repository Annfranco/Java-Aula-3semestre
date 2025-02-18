package com.example;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("0041", "Vanessa", "nessa@gmail.com", "Rua da Alegria", "719888-7777", 
            new ContaBancaria("0001", "Itaú", 2000, "9876542-78", 14000, "Poupanca"));

        System.out.println(funcionario.toString());
    }
}