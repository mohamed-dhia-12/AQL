package org.example.testtp0;

import org.example.tp0.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci_ReturnsCorrectValue_ForKnownInputs() {
        Assertions.assertEquals(0, Fibonacci.fibonacci(0), "F(0) doit être 0");
        assertEquals(1, Fibonacci.fibonacci(1), "F(1) doit être 1");
        assertEquals(1, Fibonacci.fibonacci(2), "F(2) doit être 1");
        assertEquals(2, Fibonacci.fibonacci(3), "F(3) doit être 2");
        assertEquals(3, Fibonacci.fibonacci(4), "F(4) doit être 3");
        assertEquals(5, Fibonacci.fibonacci(5), "F(5) doit être 5");
        assertEquals(8, Fibonacci.fibonacci(6), "F(6) doit être 8");
        assertEquals(13, Fibonacci.fibonacci(7), "F(7) doit être 13");
    }

    @Test
    void fibonacci_ThrowsException_ForNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1),
                "Appeler fibonacci avec un n négatif doit lever une IllegalArgumentException");
    }
}
