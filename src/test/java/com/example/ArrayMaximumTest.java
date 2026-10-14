package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMaximumTest {
    @Test
    void testMaximum() {
        ArrayMaximum obj = new ArrayMaximum();
        assertEquals(
            9,
            obj.maximum(new int[]{4, 2, 9, 1})
        );
    }
    @Test
    void testEmptyArray() {
        ArrayMaximum obj = new ArrayMaximum();

        assertThrows(
            IllegalArgumentException.class,
            () -> obj.maximum(new int[]{})
        );
    }
}
