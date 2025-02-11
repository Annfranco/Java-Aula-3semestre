import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nome;
        double[] notas = new double[2]; // Supondo que você tenha duas notas para validar

        // Entrada do nome do aluno
        System.out.print("Digite o nome do aluno: ");
        nome = read.nextLine();

        // Entrada e validação das notas
        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Digite a nota " + (i + 1) + " (entre 0 e 10): ");
                notas[i] = read.nextDouble();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
                }
            } while (notas[i] < 0 || notas[i] > 10); // Continua pedindo a nota até que seja válida
        }

        // Exibindo as informações
        System.out.println("\nExibindo as notas: ");
        System.out.println("Nome do Aluno: " + nome);
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        read.close();
    }
}

