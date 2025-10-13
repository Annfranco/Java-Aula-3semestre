package br.com.example.atividade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidadorSenhaTest {

    @Test
    void testSenhaValida() {
        ValidadorSenha validador = new ValidadorSenha();
        boolean resultado = validador.validar("Senha123");
        assertTrue(resultado, "A senha 'Senha123' deve ser válida.");

    }

    @Test
    void testSenhaInvalida() {
        ValidadorSenha validador = new ValidadorSenha();
        boolean resultado = validador.validar("abc");
        assertFalse(resultado, "A senha 'abc' deve ser inválida.");
    }
}