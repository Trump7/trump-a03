/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matthew Trump
 */
import baseLine.Solution24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution24Test {

    @Test
    void testIsAnagram1() {
        Solution24 solution = new Solution24();

        //testing wrong strings with the same character length.
        boolean actual = solution.isAnagram("Pizza","plate");
        assertEquals(false, actual);
    }

    @Test
    void testIsAnagram2() {
        Solution24 solution = new Solution24();

        boolean expected = true;
        //Also testing the to-lower-case feature.
        boolean actual = solution.isAnagram("TrIanGlE","INtEgrAL");
        assertEquals(true, actual);
    }

}
