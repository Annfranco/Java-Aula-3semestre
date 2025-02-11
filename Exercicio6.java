import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //Altere o exercicio 5 validando a nota que o usuario está inserindo. 
        //Caso seja menor que zero ou maior que dez, repita a pergunta.
        
        Scanner notas = new Scanner(System.in);

        String nome;
        double nota;
        
        System.out.println("Digite seu nome: ");
        nome = notas.next();

        do {
        System.out.println("Informe sua nota: ");
        nota = notas.nextDouble();

        } while (nota < 0 || nota > 10 );

        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Nota informada: " + nota);
    }
}
