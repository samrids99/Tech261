package com.sparta.sr.static_example;

public class App {
    public static void main(String[] args) {
        Spartan sam = new Spartan();
        Spartan carl = new Spartan();

        sam.setName("Sam");
        carl.setName("Carl");
        System.out.println(sam.getName());
        System.out.println(carl.getName());
        Spartan.printSpartan(sam);
    }
}
