package com.example;

public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private int numeroDePaginas;
    private double preco;

    public Livro(String titulo, String autor, int isbn, int numeroDePaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroDePaginas = numeroDePaginas;
        this.preco = preco;
    }

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
