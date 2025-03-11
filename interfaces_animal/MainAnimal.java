public class MainAnimal {
    public static void main(String[] args) {
        Animal passaro = new Passaro();
        Animal vaca = new Vaca();
        Animal hiena = new Hiena();

        System.out.println("Pássaro: " + passaro.emitirSom() + " - " + passaro.comer());
        System.out.println("Vaca: " + vaca.emitirSom() + " - " + vaca.comer());
        System.out.println("Hiena: " + hiena.emitirSom() + " - " + hiena.comer());
    }
}