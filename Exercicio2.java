import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        
        String nome, resultado;
        double primeiraNota, segundaNota, media;
        
        System.out.println("Digite seu nome: ");
        nome = notas.next();
        
        System.out.println("Digite sua primeira nota: ");
        primeiraNota = notas.nextDouble();
        
        System.out.println("Digite sua segunda nota: ");
        segundaNota = notas.nextDouble();
        
        media = (primeiraNota + segundaNota) / 2;
        
        if (media >= 7){
            resultado = "Aprovado";
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
