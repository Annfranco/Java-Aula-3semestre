package com.example;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("A Seleção", "Kiera Cass", 9872176, 256, 68.9);
        Veiculo veiculo = new Veiculo("B87DHE", "Azul", 4, 500, 250, 360);

        System.out.println("Nome: " + livro.getTitulo());
        System.out.println("Idade: " + livro.getAutor());
        System.out.println("ISBN: " + livro.getIsbn());
        System.out.println("Número de Páginas: " + livro.getNumeroDePaginas());
        System.out.println("Preço: " + livro.getPreco());

        System.out.println("\nPlaca: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Número de Passageiros: " + veiculo.getNumeroDePassageiros());
        System.out.println("Capacidade de Tanque: " + veiculo.getCapacidadeDeTanque());
        System.out.println("Velocidade Máxima: " + veiculo.getVelocidadeMaxima());
        System.out.println("Consumo Médio: " + veiculo.getConsumoMedio());
    }
}