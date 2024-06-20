package com.sparta.sr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.sparta.sr.Palindrome.findTheLongestPalindromeInASentence;

public class PalindromeTests {

    @Test
    void givenAStringWithSpecialCharsMethodErasesThem() {
        // arrange
        String input = "da!3?d";
        String expected = "dad";
        // act
        String actual = findTheLongestPalindromeInASentence(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void givenAStringWithNoPalindromesMethodReturnsAnEmptyString() {
        // arrange
        String input = "there are no palindromes here";
        String expected = "";
        // act
        String actual = findTheLongestPalindromeInASentence(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void givenMultipleInstancesOfOnePalindromeWillReturnJustOneString() {
        // arrange
        String input = "dad dad dad dad dad";
        String expected = "dad";
        // act
        String actual = findTheLongestPalindromeInASentence(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void givenAStringOfLessThan3LettersWillReturnEmptyString() {
        // arrange
        String input = "aa";
        String expected = "";
        // act
        String actual = findTheLongestPalindromeInASentence(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void givenMultiplePalindromesItWillReturnTheLongest() {
        // arrange
        String input = "dad rotator hannah";
        String expected = "rotator";
        // act
        String actual = findTheLongestPalindromeInASentence(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void givenMultiplePalindromesOfSameLengthReturnsAll() {
        // arrange
        String input = "rotator racecar";
        String expected = "rotator, racecar";
        // act
        String actual = findTheLongestPalindromeInASentence(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }
}