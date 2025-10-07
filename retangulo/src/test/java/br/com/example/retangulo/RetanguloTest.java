package br.com.example.retangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RetanguloTest {

    @Test
    public void testCalcularArea() {
        Retangulo r = new Retangulo(2,3);
        int area = r.calcularArea();
        System.out.println(area);
        assertEquals(6, area);
    }

    @Test
    public void testCalcularPerimetro() {
        Retangulo r = new Retangulo(3, 3);
        int perimetro = r.calcularPerimetro();
        System.out.println(perimetro); 
        assertEquals(12, perimetro);

    }

}