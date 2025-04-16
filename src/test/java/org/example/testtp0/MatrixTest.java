package org.example.testtp0;

import org.example.tp0.Matrix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void testAdd() {
        // Test d'addition de matrices de même taille
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix matrix2 = new Matrix(2);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        matrix1.add(matrix2);

        assertEquals(6, matrix1.get(0, 0));
        assertEquals(8, matrix1.get(0, 1));
        assertEquals(10, matrix1.get(1, 0));
        assertEquals(12, matrix1.get(1, 1));
    }

    @Test
    void testAddDifferentSize() {
        // Test d'exception pour matrice de tailles différentes
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(3);

        assertThrows(IllegalArgumentException.class, () -> matrix1.add(matrix2));
    }

    @Test
    void testMultiply() {
        // Test de multiplication de matrices de même taille
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix matrix2 = new Matrix(2);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        matrix1.multiply(matrix2);

        assertEquals(19, matrix1.get(0, 0)); // 1*5 + 2*7
        assertEquals(22, matrix1.get(0, 1)); // 1*6 + 2*8
        assertEquals(43, matrix1.get(1, 0)); // 3*5 + 4*7
        assertEquals(50, matrix1.get(1, 1)); // 3*6 + 4*8
    }

    @Test
    void testMultiplyDifferentSize() {
        // Test d'exception pour matrice de tailles différentes
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(3);

        assertThrows(IllegalArgumentException.class, () -> matrix1.multiply(matrix2));
    }

    @Test
    void testTranspose() {
        // Test de la transposition d'une matrice
        Matrix matrix = new Matrix(2);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        matrix.transpose();

        assertEquals(1, matrix.get(0, 0));
        assertEquals(3, matrix.get(0, 1));
        assertEquals(2, matrix.get(1, 0));
        assertEquals(4, matrix.get(1, 1));
    }

    @Test
    void testTransposeSingleElementMatrix() {
        // Test limite : Transposer une matrice de 1 élément
        Matrix matrix = new Matrix(1);
        matrix.set(0, 0, 5);

        matrix.transpose();

        assertEquals(5, matrix.get(0, 0)); // La transposition n'a pas d'effet sur une matrice 1x1
    }

    @Test
    void testToString() {
        // Test de la méthode toString
        Matrix matrix = new Matrix(2);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        String expected = "[1, 2]\n[3, 4]\n";
        assertEquals(expected, matrix.toString());
    }

    @Test
    void testToString3x3() {
        // Test de la méthode toString pour une matrice 3x3
        Matrix matrix = new Matrix(3);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(0, 2, 3);
        matrix.set(1, 0, 4);
        matrix.set(1, 1, 5);
        matrix.set(1, 2, 6);
        matrix.set(2, 0, 7);
        matrix.set(2, 1, 8);
        matrix.set(2, 2, 9);

        String expected = "[1, 2, 3]\n[4, 5, 6]\n[7, 8, 9]\n";
        assertEquals(expected, matrix.toString());
    }
}
