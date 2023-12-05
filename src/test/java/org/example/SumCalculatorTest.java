package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void beforeEach() {
        sumCalculator = new SumCalculator();
    }
    @Test
    void testThatSumWorksCorrect1() {
        //When
        int result = sumCalculator.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testThatSumWorksCorrect2() {
        //When
        int result = sumCalculator.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testThatExeptionWorksCorrect() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int result = sumCalculator.sum(0);
        });
    }
}