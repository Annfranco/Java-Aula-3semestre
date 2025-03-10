package atividade2;

public class MainAnimal {
    Cachorro toto = new Cachorro();
    Gato bichano = new Gato();
    Pato pato = new Pato();
    Galo galo = new Galo();

    public static void main(String[] args) {
        MainAnimal main = new MainAnimal();
        System.out.println("Cachorro:");
        System.out.println("Som: " + main.toto.emitirSom());
        System.out.println("Alimentação: " + main.toto.comer());
        System.out.println("\nGato: ");
        System.out.println("Som: " + main.bichano.emitirSom());
        System.out.println("Alimentação: " + main.bichano.comer());
        System.out.println("\nPato: ");
        System.out.println("Som: " + main.pato.emitirSom());
        System.out.println("Alimentação: " + main.pato.comer());
        System.out.println("\nGalo: ");
        System.out.println("Som: " + main.galo.emitirSom());
        System.out.println("Alimentação: " + main.galo.comer());
    }
}
