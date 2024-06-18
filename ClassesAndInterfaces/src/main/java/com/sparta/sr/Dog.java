package com.sparta.sr;

public class Dog extends Animal {
    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void play(String name) {
        System.out.println(name + " wants to play fetch with " + super.getName());
    }
}
