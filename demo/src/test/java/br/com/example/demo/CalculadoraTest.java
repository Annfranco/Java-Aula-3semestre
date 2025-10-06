package br.com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void somaDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(2, 0);
        System.out.println(soma);
        assertEquals(2, soma);
    }

    @Test
    public void divisaoDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divisao(4, 2);
        System.out.println(divisao);
        assertEquals(2, divisao);
    }
}
