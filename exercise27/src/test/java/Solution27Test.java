/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
import baseline.Solution27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Solution27Test {
    //create a constructor for Solution27
    Solution27 base = new Solution27();

    @Test
    void validateFirstNameTest(){
        //validate first name with example first name
        assertEquals(true, base.validateFirstName("john"));
    }
    @Test
    void validateLastNameTest(){
        //validate last name with example last name
        assertEquals(true, base.validateLastName("johnson"));
    }
    @Test
    void validateZipTest(){
        //validate zip code with example zip code
        assertEquals(true, base.validateZip("12345"));
    }
    @Test
    void validateIDTest(){
        //validate ID with example ID
        assertEquals(true, base.validateID("AB-1234"));
    }
}
