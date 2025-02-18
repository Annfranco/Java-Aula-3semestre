package com.example;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Garota Exemplar", "Gillian Flynn", 256, 59.0);

        System.out.println("\nDados do Primeiro Livro.");
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Número de Paginas: " + livro1.getNumeroDePaginas());
        System.out.println("Preço: " + livro1.getPreco());

        Livro livro2 = new Livro();
        livro2.setTitulo("Livro da Noite");
        livro2.setAutor("Holly Black");
        livro2.setNumeroDePaginas(456);
        livro2.setPreco(69.0);

        System.out.println("\nDados do Segundo Livro.");
        System.out.println("Titulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Número de Paginas: " + livro2.getNumeroDePaginas());
        System.out.println("Preço: " + livro2.getPreco());
    }
}