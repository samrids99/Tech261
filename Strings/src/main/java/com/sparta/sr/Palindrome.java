package com.sparta.sr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// a method that returns true if a word is the same forwards as it is backwards
// case-insensitive
// takes spaces into account
// at least 3  letters

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(findTheLongestPalindromeInASentence("The longest palindrome in this" +
                "sentence is not dad, nor mum, nor hannah, but rotator and racecar"));
    }


    public static String findTheLongestPalindromeInASentence(String sentence) {
        // get rid of special characters
        String strippedSentence = stripSpecialCharacters(sentence);
        // get array
        String[] individualWordsOfSentence = splitSentenceIntoIndividualWords(strippedSentence);
        // get palindromes
        Object[] allPalindromesArray = separatePalindromesIntoNewArray(individualWordsOfSentence);
        // get longest palindrome
        String longestPalindrome = createPalindromeString(allPalindromesArray);
        // return palindrome
        return longestPalindrome;
    }





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

//    Part 2:
//    Create a program that finds the longest unique Palindrome in a sentence
//    A sentence is defined as a single string of words separated by whitespace
//    If there are 2 or more largest palindromes, both should be returned
//    The program should ignore all non-alphabet characters
//    1234567890!@#$%^&*()-_=+{}[]:;'?/.><,  regex = [^a-zA-Z\\s]



   // eliminate all special characters from the string
   public static String stripSpecialCharacters(String originalString){
        String strippedString = originalString.replaceAll("[^a-zA-Z\\s]", "");
        return strippedString;
   }

    // split up each word using white spaces as boundaries and put into an array
    public static String[] splitSentenceIntoIndividualWords(String strippedString) {
        String[] stringsArray = {};
        String[] splitStrings = strippedString.split("\\s+");
        return splitStrings;
    }

    // check if each word in an array is a palindrome
    // put into a new array if true
    public static Object[] separatePalindromesIntoNewArray(String[] initialArray) {
        ArrayList<String> arrayOfPalindromes = new ArrayList<String>();
        for (int i = 0; i < initialArray.length; i++) {
            if (isItAPalindrome(initialArray[i])) {
                arrayOfPalindromes.add(initialArray[i]);
            }
        }
        Object[] arrayOfObjects = arrayOfPalindromes.toArray();
        return arrayOfObjects;
    }

    // iterate over each object to get a string
    public static String createPalindromeString(Object[] arrayOfObjects) {
        int longestPalindromeLength = 0;
        // have to use set and hashSet as it doesn't allow duplicates unlike list
        // a hashSet is an unordered/sorted set
        Set<String> longestPalindromesSet = new HashSet<>();
        for (Object arrayOfObject : arrayOfObjects) {
            String eachString = arrayOfObject.toString();
            if (eachString.length() > longestPalindromeLength) {
                longestPalindromeLength = eachString.length();
                longestPalindromesSet.clear();
                longestPalindromesSet.add(eachString);
            } else if (eachString.length() == longestPalindromeLength) {
                longestPalindromesSet.add(eachString);
            }
        }
        return String.join(", ", longestPalindromesSet);
    }
}
