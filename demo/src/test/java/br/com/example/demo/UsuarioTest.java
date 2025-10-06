package br.com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UsuarioTest {
    @Test
    public void testCriarUsuarioValido() {
        Usuario usuario = new Usuario("Rayanne");
        assertEquals("Rayanne", usuario.getNome());
    }

    @Test
    public void testCriarUsuarioInvalido() {
        Exception e = assertThrows
        (IllegalArgumentException.class, 
            () -> new Usuario(""));
        assertEquals("Nome inválido", e.getMessage());
    }
}
