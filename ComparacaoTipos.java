public class ComparacaoTipos {
    public static void main(String[] args) {
        // Declarando variaveis.
        String nomeUsuario = "Marta";
        int senha = 123;

        // Comparação de String e inteiros.
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);

        // Exibindo resultados.
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);

    }
}
