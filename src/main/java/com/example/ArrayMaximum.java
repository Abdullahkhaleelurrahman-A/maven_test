package com.example;
public class ArrayMaximum {
    public int maximum(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException();
        }
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
