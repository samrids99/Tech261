package com.sparta.sr;

public class Cat extends Animal{
    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void play() {
        System.out.println(super.getName() + " does not want to play");
    }

    public void eat() {
        System.out.println("kibble");
    }
}
