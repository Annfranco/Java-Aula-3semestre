import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String login, senha;
        boolean resultadoLogin, resultadoSenha;

        do {

            System.out.println("Login: ");
            login = read.next();

            System.out.println("Senha: ");
            senha = read.next();

            resultadoLogin = login.equals("Marta");
            resultadoSenha = senha.equals("123");

                if (!resultadoLogin || !resultadoSenha) {
                    System.out.println("Login ou senha inválidos.");
                }
        } while(!resultadoLogin || !resultadoSenha);

        System.out.println("Bem-vindo!");

    }
}
