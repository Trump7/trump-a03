/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class PaymentCalculator {
    //Create variables that will hold data for the formula
    double i;
    double p;
    double b;

    //void methods to be called by Solution26 to store a value
    public void setI(final double i){
        this.i = i;
    }
    public void setP(final double p){
        this.p = p;
    }
    public void setB(final double b){
        this.b = b;
    }

    public int calculateMonthsUntilPaidOff(){
        //Number of months to pay off the card
        double months;

        //Use formula n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //Break up the equation into multiple parts
        months = (-1.0 / 30.0);
        //Multiply the first fraction by the numerator
        months *= Math.log(1.0 + ((this.b/this.p) * (1.0 - (Math.pow((1.0 + this.i), 30.0)))));
        //Divide the numerator by the denominator
        months /= Math.log(1.0 + this.i);

        //round n to the nearest whole month by adding .5 and rounding
        //return number of months, as an integer, it will take to finance
        return (int)Math.round(months + 0.5);
    }
}
