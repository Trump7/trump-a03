import baseline.Solution25;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution25Test {

    @Test
    void passwordValidatorTest1(){
        Solution25 solution = new Solution25();
        //This password should result in 4 or "a very strong password"
        //because it contains numbers, letters, special characters, and greater than 8 characters.
        assertEquals(4, solution.passwordValidator("abcd12345#"));
    }

    @Test
    void passwordValidatorTest2(){
        Solution25 solution = new Solution25();
        //This password should result in 2 or "a weak password"
        //because it is only letters and fewer than 8 characters.
        assertEquals(2, solution.passwordValidator("abcdefg"));
    }

    @Test
    void passwordValidatorTest3(){
        Solution25 solution = new Solution25();
        //This password should result in 0 or "unknown strength"
        //because it is only numbers and greater than 8 characters.
        assertEquals(0, solution.passwordValidator("987654321"));
    }
}
