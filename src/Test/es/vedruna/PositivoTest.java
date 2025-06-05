package es.vedruna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositivoTest {

    @Test
    void contarPositivos() {
        // Caso 1: positivos antes del 0
        int[] caso1 = {5, -3, 2, 0, 9}; // 5 y 2 (2 positivos antes del 0)
        assertEquals(2, Positivo.contarPositivos(caso1));

        // Caso 2: sin positivos antes del 0
        int[] caso2 = {-1, -2, 0, 4}; // 0 positivos antes del 0
        assertEquals(0, Positivo.contarPositivos(caso2));

        // Caso 3: sin 0, todos positivos
        int[] caso3 = {1, 2, 3}; // 3 positivos
        assertEquals(3, Positivo.contarPositivos(caso3));

        // Caso 4: 0 al principio
        int[] caso4 = {0, 1, 2, 3}; // se detiene en el 0, ningún positivo contado
        assertEquals(0, Positivo.contarPositivos(caso4));

        // Caso 5: array vacío
        int[] caso5 = {}; // no hay nada
        assertEquals(0, Positivo.contarPositivos(caso5));
    }
}