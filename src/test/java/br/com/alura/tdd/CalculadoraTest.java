package br.com.alura.tdd;

import br.com.alura.tdd.modelo.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void somar() {

        Calculadora calc = new Calculadora();

        assertAll(() -> assertEquals(7, calc.somar(5, 2)),
                () -> assertEquals(12, calc.somar(5, 7)),
                () -> assertEquals(4, calc.somar(5, -1)),
                () -> assertEquals(3, calc.somar(5, -2)));

    }
}