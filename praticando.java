
import java.util.Scanner;

public class praticando {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        String nome;
        double nota;

        System.out.println("Informe seu nome: ");
        nome = notas.next();

        System.out.println("Nome do Aluno: " + nome);

        do { 
            for (int i = 0; i < 2; i++) {
                System.out.println("Informe sua nota: ");
                nota = notas.nextDouble();
            }
            
        } while (nota < 0 || nota > 10);    

        System.out.println("Informe nota: " + nota);
    }
}
