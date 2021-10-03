/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
import baseline.Solution36;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class Solution36Test {
    Solution36 solution = new Solution36();
    ArrayList<Integer> numbers = new ArrayList<Integer>();


    @Test
    public void stdTest(){
        //Do the calculations by hand and store it in a double
        double actual = 353.55;

        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        //Compare the hand done calculation with the functions calculation
        assertEquals(actual, solution.std(numbers), 0.01);
    }

    @Test
    public void minTest(){
        //Do the calculations by hand and store it in a int
        int actual = 100;

        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        //Compare the hand done calculation with the functions calculation
        assertEquals(actual, solution.min(numbers));
    }

    @Test
    public void maxTest(){
        //Do the calculations by hand and store it in a int
        int actual = 1000;

        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        //Compare the hand done calculation with the functions calculation
        assertEquals(actual, solution.max(numbers));
    }

    @Test
    public void averageTest(){
        //Do the calculations by hand and store it in a double
        double actual = 400;

        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        //Compare the hand done calculation with the functions calculation
        assertEquals(actual, solution.average(numbers));
    }
}
