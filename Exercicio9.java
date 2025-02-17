import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            double nota;
            do {
                System.out.println("Digite uma nota: ");
                nota = read.nextDouble();

            } while(nota < 0 || nota > 10);  

            notas.add(nota);
        }

        for (double nota: notas) {
            System.out.println("Nota: " + nota);
        }

        read.close();
    }
}
