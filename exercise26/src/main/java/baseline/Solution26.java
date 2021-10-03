/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.Scanner;

public class Solution26 {

    public static void main(String[] args) {
        //Constructor for PaymentCalculator class
        PaymentCalculator pay = new PaymentCalculator();
        Scanner input = new Scanner(System.in);

        //double p for monthly payment
        double p = 0;
        //double b for balance
        double b = 0;
        //double i for daily rate
        double i = 0;

        //int n for number of months
        int n = 0;
        //The program should ask the user for each of these variables except number of months
        System.out.print("What is your balance? ");
        b = input.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        //divide by 100 to get decimal percent, then divide by 365 to get daily rate
        i = input.nextDouble() / 36500.0;
        System.out.print("What is the monthly payment you can make? ");
        p = input.nextDouble();

        //store variables in PaymentCalculator class
        pay.setI(i);
        pay.setP(p);
        pay.setB(b);

        //Assign m variable to returned value from calculateMonthsUntilPaidOff
        n = pay.calculateMonthsUntilPaidOff();

        //Print how many months it will take to pay off the card to the user
        System.out.println("It will take you " + n + " months to pay off this card.");
    }
}
