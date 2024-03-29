package com.example.sumsquaredifference.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareServiceTest {

    SquareService squareService;

    @BeforeEach
    void setUp() {
        squareService = new SquareService();
    }

    @Test
    void whenSummingSquareOfFirstTenNaturalNumbers_shouldBeThreeHundredEightyFive() {
        int expectedResult = 385;
        int range = 10;

        int result = squareService.sumSquareOfNumbers(range);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenSquareOfSummingFirstTenNaturalNumbers_shouldBe3025() {
        int expectedResult = 3025;
        int range = 10;

        int result = squareService.squareOfSumNumbers(range);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenDifferenceBetweenSumsForTenNaturalNumbers_shouldBe2640() {
        int expectedResult = 2640;
        int range = 10;

        int result = squareService.differenceBetweenSums(range);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenDifferenceBetweenSumsForTwoNaturalNumbers_shouldBeFour() {
        int expectedResult = 4;
        int range = 2;

        int result = squareService.differenceBetweenSums(range);

        assertThat(result).isEqualTo(expectedResult);
    }
}