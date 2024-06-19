package com.sparta.sr;

public class App {

    public static void main(String[] args) {
        Spartan spartan1 = new Spartan("Sam", "Ridsdale");
        Spartan spartan2 = new Spartan("Sam", "Ridsdale");

        System.out.println(spartan2 == spartan1); // returns false
        System.out.println(spartan1.equals(spartan2)); // also false, does the same coming from object ==

    }
}
