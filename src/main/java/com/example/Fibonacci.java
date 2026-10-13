package com.example;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public List<Integer> sequence(int count) {
        if (count < 0) {
            throw new IllegalArgumentException();
        }

        List<Integer> result = new ArrayList<>();
        int a = 0, b = 1;

        for (int i = 0; i < count; i++) {
            result.add(a);
            int next = a + b;
            a = b;
            b = next;
        }

        return result;
    }
}
