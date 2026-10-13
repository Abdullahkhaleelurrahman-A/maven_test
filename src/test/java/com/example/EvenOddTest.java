package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {
    @Test
    void testEvenOdd() {
        EvenOdd obj = new EvenOdd();
        assertTrue(obj.isEven(8));
        assertFalse(obj.isEven(7));
    }
}