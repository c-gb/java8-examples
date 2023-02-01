package com.slb.java8;

import java.util.Arrays;

public class ParallelArraysSLBJava8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] squares = new int[numbers.length];

        // Compute the squares of each number in parallel
        Arrays.parallelSetAll(squares, i -> numbers[i] * numbers[i]);

        // Print the squares
        Arrays.stream(squares).forEach(System.out::println);
    }
}