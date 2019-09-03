package com.example.service;

public class SquareService {

    public int differenceBetweenSums(int range) {
        return squareOfSumNumbers(range) - sumSquareOfNumbers(range);
    }

    public int sumSquareOfNumbers(int range) {
        int sum = 0;
        for (int i = 0; i <= range; i++) {
            sum += getSquareOfNumbers(i);
        }
        return sum;
    }

    public int squareOfSumNumbers(int range) {
        int sum = 0;
        for (int i = 0; i <= range; i++) {
            sum += i;
        }
        return getSquareOfNumbers(sum);
    }

    private int getSquareOfNumbers(int number) {
        return (int) Math.pow(number, 2);
    }
}
