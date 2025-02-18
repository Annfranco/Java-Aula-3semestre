package com.example;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Mel", 4, "Fila", "Grande", "Ração");
        Pet pet2 = new Pet("Lupita", 11, "SRD", "Médio", "Ração");

        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        System.out.println("Raça: " + pet1.getRaca());
        System.out.println("Porte: " + pet1.getPorte());
        System.out.println("Alimentação: " + pet1.getAlimentacao());

        System.out.println("\nNome: " + pet2.getNome());
        System.out.println("Idade: " + pet2.getIdade());
        System.out.println("Raça: " + pet2.getRaca());
        System.out.println("Porte: " + pet2.getPorte());
        System.out.println("Alimentação: " + pet2.getAlimentacao());
        
    }
}