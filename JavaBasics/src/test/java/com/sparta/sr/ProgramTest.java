package com.sparta.sr;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class ProgramTest {
    @Test
    @DisplayName("Given a time of 21, then the greeting should be Good Evening")
    void checkThat21GivesGoodEvening(){
        int time = 21;
        String expectedGreeting = "Good Evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 12, then the greeting should be Lunch time!")
    void checkThat12GivesGoodLunchTime() {
        int time = 12;
        String expectedGreeting = "Lunch time!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given an invalid time, the greeting should be Invalid time")
    void checkInvalidTime() {
        int invalidTime1 = -28;
        int invalidTime2 = 7000;
        String expectedGreeting = "Invalid time. Please enter a value between 0 and 24.";

        String actualGreeting1 = Program.getGreeting(invalidTime1);
        String actualGreeting2 = Program.getGreeting(invalidTime2);

        Assertions.assertEquals(expectedGreeting, actualGreeting1);
        Assertions.assertEquals(expectedGreeting, actualGreeting2);
    }
}
