package com.sparta.sr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.sparta.sr.App.itHasThreeConsecutiveNumbers;

public class AppTests {

    @Test
    void givenAnInputOfTooShortArrayReturnFalse() {
        // arrange
        int[] input = {1, 4};
        boolean expected = false;

        // act
        boolean actual = itHasThreeConsecutiveNumbers(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void givenAnInputOfThreeNeighboursReturnTrue() {
        // arrange
        int[] input = {1, 4, 4, 4, 7, 8, 12};
        boolean expected = true;

        // act
        boolean actual = itHasThreeConsecutiveNumbers(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void givenAnInputOfNegativeIntegersReturnFalse() {
        // arrange
        int[] input = {1, 4, -4, 4, 7, 8, 12};
        boolean expected = false;

        // act
        boolean actual = itHasThreeConsecutiveNumbers(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void givenNeighboursAreAtTheEndReturnTrue() {
        // arrange
        int[] input = {1, 4, -4, 4, 7, 8, 12, 7, 70, 1, 28, 28, 28};
        boolean expected = true;

        // act
        boolean actual = itHasThreeConsecutiveNumbers(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }
}
