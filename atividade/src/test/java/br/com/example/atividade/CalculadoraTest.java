package br.com.example.atividade;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testSomar() {
        Calculadora calc = new Calculadora(); 
        int resultado = calc.somar(2, 3);
        System.out.println("Resultado da soma: " + resultado);
        assertEquals(5, resultado);
    }
}