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
}
