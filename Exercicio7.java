import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        
        String nome, resultado;
        double primeiraNota, segundaNota, media;
        
        System.out.println("Digite seu nome: ");
        nome = notas.next();
        
        do {
            System.out.println("Digite sua primeira nota: ");
            primeiraNota = notas.nextDouble();
        } while (primeiraNota < 0 || primeiraNota > 10 );

        do {
            System.out.println("Digite sua segunda nota: ");
            segundaNota = notas.nextDouble();
        } while (segundaNota < 0 || segundaNota > 10);
        
        media = (primeiraNota + segundaNota) / 2;
        
        if (media > 7){
            resultado = "Aprovado";
        } else if (media >= 5){
            resultado = "Verificação suplementar";
        } else {
            resultado = "Reprovado";
        }
        
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Primeira Nota: " + primeiraNota);
        System.out.println("Segunda Nota: " + segundaNota);
        System.out.println("Media: " + media);
        System.out.println("Resultado: " + resultado);
    }
}
