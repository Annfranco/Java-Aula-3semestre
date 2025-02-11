
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int avaliacao;
        do {
            System.out.println("Avalie nosso atendimento, de 1 a 5 estrelas: ");
            avaliacao = ler.nextInt();
        } while(avaliacao < 1 || avaliacao > 5);

        System.out.println("Obrigado!");
    }
}
