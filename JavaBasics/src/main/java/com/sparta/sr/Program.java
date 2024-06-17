package com.sparta.sr;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 12;
        System.out.println(getGreeting(timeOfDay));
    }

    public static String getGreeting(int timeOfDay) {
        if (0 <= timeOfDay && timeOfDay < 5) {
            return "You should be sleeping!";
        } else if (5 <= timeOfDay && timeOfDay < 12) {
            return "Good Morning!";
        } else if (timeOfDay == 12) {
            return "Lunch time!";
        } else if (12 < timeOfDay && timeOfDay <= 18) {
            return "Good Afternoon!";
        } else if (18 < timeOfDay && timeOfDay <= 24) {
            return "Good Evening!";
        } else {
            return "Invalid time. Please enter a value between 0 and 24.";
        }
    }
}
