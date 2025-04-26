package org.example.testtp1.BranchCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.example.tp1.QuadraticEquation;
import org.junit.jupiter.api.Test;

public class  QuadraticEquationTest  {

    @Test
    public void testRootOne() {
        double[] result = QuadraticEquation.solve(1, -2, 1);
        assertArrayEquals(new double[]{1}, result);
    }

    @Test
    public void testRootsTwo() {
        double[] result = QuadraticEquation.solve(1, -3, 2);
        assertArrayEquals(new double[]{2, 1}, result);
    }

    @Test
    public void testNoRealRoots() {
        assertNull(QuadraticEquation.solve(1, 1, 1));
    }

    @Test
    public void testInvalidCoefficientA() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(0, 2, 1);
        });
    }

    @Test
    public void testDeltaZero() {
        double[] result = QuadraticEquation.solve(1, 2, 1);
        assertArrayEquals(new double[]{-1}, result); // delta == 0
    }

    @Test
    public void testDeltaPositive() {
        double[] result = QuadraticEquation.solve(1, 5, 6);
        assertArrayEquals(new double[]{-2, -3}, result); // delta > 0
    }

    @Test
    public void testDeltaNegative() {
        assertNull(QuadraticEquation.solve(1, 1, 1)); // delta < 0
    }
}
