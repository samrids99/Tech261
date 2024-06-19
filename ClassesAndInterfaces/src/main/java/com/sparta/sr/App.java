package com.sparta.sr;

public class App {
    public static void main(String[] args) {
       Dog pop = new Dog("Poppadom", "Cockerpoo", 7);
        Cat tia = new Cat("Tia", "Persian", 10);

        tia.play();
        pop.play();
        pop.play("Carl");
        pop.eat();
    }
}
