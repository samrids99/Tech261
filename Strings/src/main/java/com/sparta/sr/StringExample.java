package com.sparta.sr;

public class StringExample {
    public static void main(String[] args) {
       String string1 = "Hello";
       string1.toUpperCase();
       // Strings in Java are immutable
        // Once declared, in cannot be changed. toUppercase returns a new object
        // We need to store it in a new field eg:
        String string1new = string1.toUpperCase();
        System.out.println(string1);
        System.out.println(string1new);

        System.out.println(string1new.toCharArray());
    }
}
