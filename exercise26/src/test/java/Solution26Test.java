/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
import baseline.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution26Test {
    PaymentCalculator pay = new PaymentCalculator();

    //These tests will take in the calculator in PaymentCalculator class
    //and compare it to a pre solved number
    @Test
    void PaymentCalculator1(){
        pay.setI(12.0/36500.0);
        pay.setB(5000.0);
        pay.setP(100.0);

        assertEquals(70, pay.calculateMonthsUntilPaidOff());
    }
    @Test
    void PaymentCalculator2(){
        pay.setI(12.0/36500.0);
        pay.setB(2500);
        pay.setP(125);

        assertEquals(23, pay.calculateMonthsUntilPaidOff());
    }
    @Test
    void PaymentCalculator3(){
        pay.setI(15.0/36500.0);
        pay.setB(10000);
        pay.setP(250);

        assertEquals(56, pay.calculateMonthsUntilPaidOff());
    }
}
