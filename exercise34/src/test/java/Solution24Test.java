/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
import baseline.Solution34;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution24Test {
    Solution34 test = new Solution34();

    @Test
    void removeFromArrayTest1(){
        //Create a test array to pass to the removeFromArray
        String[] example = new String[] {"Matt Trump", "Donald Trump", "Barron Trump"};
        //Also create an answer array to put in assertEqual
        String[] answer = new String[] {"Donald Trump", "Barron Trump"};

        String input = "Matt Trump\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertArrayEquals(answer, test.removeFromArray(example));
    }

    @Test
    void removeFromArrayTest2(){
        //Create a test array to pass to the removeFromArray
        String[] example = new String[] {"George Washington", "John Adams", "Barack Obama", "George Bush", "Joe Biden"};
        //Also create an answer array to put in assertEqual
        String[] answer = new String[] {"George Washington", "John Adams", "Barack Obama", "George Bush"};

        String input = "Joe Biden\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertArrayEquals(answer, test.removeFromArray(example));
    }
}
