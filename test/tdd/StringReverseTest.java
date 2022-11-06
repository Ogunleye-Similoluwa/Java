package tdd;

import org.junit.jupiter.api.Test;

import w3Resource.ConditionalStatement.StringReverses;

import static org.junit.jupiter.api.Assertions.*;

public class StringReverseTest {
    @Test
    public void reverseString(){
        String input = "Olalekan";
        assertEquals( " n a k e l a l O",StringReverses.reverseStrings(input));
    }
    @Test
    public void capitalize(){
        String input = "jerry";
        String output = StringReverses.capitalizeString(input);
        assertEquals("Jerry",output);

    }
}
