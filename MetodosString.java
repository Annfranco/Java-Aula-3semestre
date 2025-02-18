public class MetodosString {
    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silveira";

        // Exibindo a quantidade de caracteres.
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        // Concatenando nome + sobrenome.
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        // Exibindo nome completo usando métodos String - Maiúsculas.
        System.out.println("Concatenando Maiúsculas: " + nomeCompleto.toUpperCase());
        
        // Exibindo nome completo usando métodos String - Minúsculas.
        System.out.println("Concatenando Minúsculas: " + nomeCompleto.toLowerCase());

    }
}
