package br.com.example.atividade;

public class ValidadorSenha {
    
    public boolean validar(String senha) {
        if (senha == null) return false;
        return senha.length() >= 8 &&
                senha.matches(".*[A-Z].*") &&
                senha.matches(".*\\d.*");
    }
    
    // public boolean validar(String senha) {

    //     if (senha == null || senha.length() < 8) {
    //         return false;
    //     }
    //     if (!senha.matches(".*[A-Z].*")) {
    //         return false;
    //     }
    //     if (!senha.matches(".*\\d.*")) {
    //         return false;
    //     }
    //     return true;
    // }

}
