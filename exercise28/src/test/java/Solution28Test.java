/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
import baseline.Solution28;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution28Test {

    @Test
    public void adderTest1() {
        Solution28 calc = new Solution28();

        String input = "1\n2\n3\n4\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(15, calc.adder());
    }

    @Test
    public void adderTest2() {
        Solution28 calc = new Solution28();

        String input = "5\n5\n5\n5\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(25, calc.adder());
    }

    @Test
    public void adderTest3() {
        Solution28 calc = new Solution28();

        String input = "100\n150\n200\n250\n500\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(1200, calc.adder());
    }
}
