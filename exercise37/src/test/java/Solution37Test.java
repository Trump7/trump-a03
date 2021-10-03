/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
import baseline.Solution37;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Solution37Test {
    Solution37 solution = new Solution37();

    @Test
    void passwordGeneratorTest1(){
        // Test to make sure the passwords length >= min length
        String temp = solution.generatePassword(8, 2, 2);

        assertEquals(true, temp.length() >= 8);
    }
    @Test
    void passwordGeneratorTest2(){
        // Test to make sure the passwords letters >= special + numbers
        String temp = solution.generatePassword(8, 2, 2);
        int letters = 0;
        int special = 0;
        int numbers = 0;

        char temper[] = temp.toCharArray();

        for(int i = 0; i < temp.length(); i++){
            if(Character.isLetter(temper[i])){
                letters++;
            }
            else if(Character.isDigit(temper[i])){
                numbers++;
            }
            else{
                special++;
            }
        }
        assertEquals(true, letters >= special + numbers);

    }
}
