package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    @Test
    void testFibonacci() {
        Fibonacci obj = new Fibonacci();

        assertEquals(
            List.of(0, 1, 1, 2, 3, 5),
            obj.sequence(6)
        );

        assertEquals(List.of(), obj.sequence(0));
    }
}
