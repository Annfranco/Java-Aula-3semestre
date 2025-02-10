
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorDaCompra = scanner.nextDouble();

        String loja = "Mamão com Açúcar";
        int quantprestacoes = 5;
        
        double valorprestacoes = valorDaCompra / quantprestacoes;
        
        System.out.println("Loja: " + loja);
        System.out.println("Valor: " + valorDaCompra);
        System.out.println("Valor de cada prestação: " + valorprestacoes);
    }
}
