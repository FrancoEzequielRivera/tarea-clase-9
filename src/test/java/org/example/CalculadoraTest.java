package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void puntoUnoTest() {
        //El resultado de multiplicar 80 por 3 da 240
        Calculadora calcu = new Calculadora();
        assertEquals(240.0, calcu.multiplicar(80, 3));
    }

    @Test
    void puntoDosTest() {
        Calculadora calcu = new Calculadora();
        //El resultado de sumar 150 y 180, dividido por 3, da 110
        assertEquals(110.0, calcu.sumar(150.0, 180.0) / 3);
    }

    @Test
    void puntoTresTest() {
        Calculadora calcu = new Calculadora();
        //El resultado de restar 90 y 50, multiplicado por 15, no da 605
        assertNotEquals(605.0, calcu.restar(90.0, 50.0) * 15);
    }

    @Test
    void puntoCuatroTest() {
        Calculadora calcu = new Calculadora();
        //El resultado de sumar 70 y 40, multiplicado por 25, no da 2700
        assertNotEquals(2700.0, calcu.sumar(70.0, 40.0) * 25);
    }
}