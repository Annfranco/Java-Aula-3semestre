
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] notas = new double[2];

        String nome;

        System.out.println("Informe seu nome: ");
        nome = read.next();

        for (int i = 0; i < 2; i++) {
            do { 
                System.out.println("Digite a " + (i + 1) + "° nota: ");
                notas[i] = read.nextDouble();
            
            } while (notas[i] < 0 || notas[i] > 10);
        }
        
        System.out.println("\nExibindo as notas: ");
        System.out.println("Nome do Aluno: " + nome);
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }
        
    }
}
