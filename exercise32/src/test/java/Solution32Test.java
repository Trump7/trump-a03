import baseline.Solution32;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
public class Solution32Test {
    Solution32 test = new Solution32();

    @Test
    void guessingGameTest(){
        String input = "1\n10\n15\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(3, test.guessingGame(15));

    }
}
