import baseline.Solution38;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution38Test {
    Solution38 solution = new Solution38();

    @Test
    public void filterEvenNumbersTest1(){
        //create a list array with unfiltered ints
        String unfiltered[] = {"1","2","3","4","5","6","7","8"};
        //create an int array with filtered ints
        Integer[] filtered = {2,4,6,8};
        //compare the filtered ints to filterEvenNumbers(unfiltered)
        assertArrayEquals(filtered, solution.filterEvenNumbers(unfiltered));
    }

    @Test
    public void filterEvenNumbersTest2(){
        //create a list array with unfiltered ints
        String unfiltered[] = {"5","10","15","20","25","30","35","40"};
        //create an int array with filtered ints
        Integer[] filtered = {10,20,30,40};
        //compare the filtered ints to filterEvenNumbers(unfiltered)
        assertArrayEquals(filtered, solution.filterEvenNumbers(unfiltered));
    }
}
