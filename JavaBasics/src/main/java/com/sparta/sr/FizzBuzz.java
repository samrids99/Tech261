package com.sparta.sr;

public class FizzBuzz {
    public static String getFizzBuzz(int num) {
        String fizzBuzzString = Integer.toString(num);
        if (num % 3 == 0 && num % 5 == 0) {
            fizzBuzzString = "FizzBuzz";
        } else if (num % 5 == 0) {
            fizzBuzzString = "Buzz";
        } else if (num % 3 == 0) {
            fizzBuzzString = "Fizz";
        }
        return fizzBuzzString;
    }

}
