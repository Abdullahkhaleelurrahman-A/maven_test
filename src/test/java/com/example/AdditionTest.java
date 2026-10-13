package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    @Test
    public void testAddition() {
        Addition obj = new Addition();

        int result = obj.add(10, 20);

        assertEquals(30, result);
    }
}
