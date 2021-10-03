/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
import baseline.Solution29;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution29Test {
    Solution29 rate = new Solution29();

    @Test
    public void getRateTest1() {
        String input = "15\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(15, rate.getRate());
    }

    @Test
    public void getRateTest2() {
        String input = "70\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(70, rate.getRate());
    }
}
