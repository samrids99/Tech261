package com.sparta.sr;

public class Palindrome {
    public static void main(String[] args) {
        String string = "racecar";
        String falseString = "at";
        String falseString2 = "race car";
        String falseString3 = "itscominghome";
        String string2 = "RaceCar";

        System.out.println(isItAPalindrome(string));
        System.out.println(isItAPalindrome(string2));
        System.out.println(isItAPalindrome(falseString));
        System.out.println(isItAPalindrome(falseString2));
        System.out.println(isItAPalindrome(falseString3));
    }

    // a method that returns true if a word is the same forwards as it is backwards
    // case-insensitive
    // takes spaces into account
    // at least 3  letters

    public static boolean isItAPalindrome(String string) {
      // needs to be case-insensitive
      String lowerCase = string.toLowerCase();
      // create a backwards string
      String reverse = new StringBuilder(lowerCase).reverse().toString();
        // System.out.println(reverse);
      // check if it is long enough
      if (string.length() < 3) {
          return false;
      } else return lowerCase.equals(reverse);
    }
}
