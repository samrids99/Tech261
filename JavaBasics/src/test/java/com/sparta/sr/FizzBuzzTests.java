package com.sparta.sr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class FizzBuzzTests {
    // print numbers in order
    // if num / by 3, print "Fizz"
    // if num / by 5, print "Buzz"
    // if num / by 3 and 5, print "FizzBuzz"
    @Test
    void givenAnInputOfOneFizzBuzzReturnsOne() {
        // arrange
        int input = 1;
        String expected = "1";

        // act
        String actual = FizzBuzz.getFizzBuzz(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"2, 2",
               "4, 4",
               "7, 7"})
    void givenInputsNotDivisibleByThreeOrFiveFizzBuzzReturnsThatNumber(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzz(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"5, Buzz",
            "25, Buzz",
            "100, Buzz"})
    void givenInputsDivisibleByFiveFizzBuzzReturnsBuzz(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzz(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"15, FizzBuzz",
            "30, FizzBuzz",
            "90, FizzBuzz"})
    void givenInputsDivisibleByFiveAndThreeFizzBuzzReturnsFizzBuzz(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzz(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void givenAnInputDivisibleByThreeFizzBuzzReturnsFizz(int input) {
        String expected = "Fizz";

        String actual = FizzBuzz.getFizzBuzz(input);

        Assertions.assertEquals(expected, actual);
    }
}
