package com.sparta.sr;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 12;
        System.out.println(getGreeting(timeOfDay));
    }

    public static String getGreeting(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting = "Good Afternoon!";
        } else {
            greeting = "Good Evening!";
        }
        return greeting;
    }
}
