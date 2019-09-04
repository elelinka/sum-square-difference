package com.example.sumsquaredifference;

import com.example.sumsquaredifference.service.SquareService;

public class Application {
    public static void main(String[] args) {
        SquareService squareService = new SquareService();

        int range10 = 10;
        int sum = squareService.sumSquareOfNumbers(range10);
        System.out.println(sum);

        int sum2 = squareService.squareOfSumNumbers(range10);
        System.out.println(sum2);

        int range100 = 100;
        int diff = squareService.differenceBetweenSums(range100);
        System.out.println(diff);
    }
}
