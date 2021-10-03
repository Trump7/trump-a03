/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
import baseline.Solution35;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution35Test {
    Solution35 test = new Solution35();

    @Test
    void getNamesTest(){
        //create an example arraylist and compare the example one to the user inputted one
        List<String> example = new ArrayList<String>();
        List<String> tester = new ArrayList<String>();
        example.add("Matt");
        example.add("Phat");
        example.add("Whack");

        String input = "Matt\nPhat\nWhack\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        tester = test.getNames();

        assertEquals(example, tester);
    }
}
