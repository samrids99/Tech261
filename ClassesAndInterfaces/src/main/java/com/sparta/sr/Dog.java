package com.sparta.sr;

public class Dog extends Animal implements Drinkable {
    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void play(String name) {
        System.out.println(name + " wants to play fetch with " + super.getName());
    }

    public void eat() {
        System.out.println("bark");
    }

    @Override
    public void drink() {

    }
}
