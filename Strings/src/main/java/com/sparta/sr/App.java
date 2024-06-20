package com.sparta.sr;

public class App {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "hello";
        String string3 = new String("hello");
        String string4 = new String("hello");

        System.out.println(string1.hashCode());
        System.out.println(string2.hashCode());
        System.out.println(string3.hashCode());
        System.out.println(string4.hashCode());
        System.out.println("");
        System.out.println(string1.equals(string3)); // because of string objects overriding of .eqauls() method
        System.out.println(string1 == string3);
        System.out.println(System.identityHashCode(string3)); // gives original hashCode based on the object rather than the string

    }
}
