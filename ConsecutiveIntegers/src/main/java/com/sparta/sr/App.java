package com.sparta.sr;

//Create a method which checks whether an array of integers contains the same value 3 times in a row.
//
//For example: { 2, 3, 3, 3, 5, 7 } returns true whilst { 3, 4, 5, 1, 2 } returns false


public class App {
    public static void main(String[] args) {
        int[] numbers1 = {2, 3, 3, 3, 5, 7};
        int[] numbers2 = {3, 4, 5, 1, 2};
        int[] numbers3 = {0, 2, 2, 2, 2, 5};

        System.out.println(itHasThreeConsecutiveNumbers(numbers1));
        System.out.println(itHasThreeConsecutiveNumbers(numbers2));
        System.out.println(itHasThreeConsecutiveNumbers(numbers3));
    }

    public static boolean itHasThreeConsecutiveNumbers(int[] numbers) {
        // If array is too short, return false
        if (numbers.length < 3) {
            return false;
        }
        // start at index 2 so can look back through array
        for (int i = 2; i < numbers.length; i++) {
            // does number3 equal number 2 as well as number 1?
            if (numbers[i] == numbers[i - 1] && numbers[i] == numbers[i - 2]) {
                return true;
            }
        }
        return false;
    }
}
