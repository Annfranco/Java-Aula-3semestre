
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String login;
        int senha;

        System.out.println("Login: ");
        login = read.next();

        System.out.println("Senha: ");
        senha = read.nextInt();

        boolean resultadoLogin = login.equals("Marta");
        boolean resultadoSenha = (senha == 123);

        if (resultadoLogin && resultadoSenha) {
            System.out.println("Bem-vindo, usuário logado.");
        } else {
            System.out.println("Nome do usuário ou senha inválidos.");
        }
    }
}
