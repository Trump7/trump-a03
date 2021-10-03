/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.Scanner;

public class Solution28 {

    public static int adder(){
        //Create a scanner input
        Scanner input = new Scanner(System.in);
        //Create a placeholder variable and initialize it to 0
        int total = 0;
        int i = 0;

        while(i != 5){
            // print enter a number:
            System.out.print("Enter a number: ");
            // make an if else statement and if input.hasnextInt() is true
            if(input.hasNextInt()){
                //  placeholder += input.nextInt()
                total += input.nextInt();
                //  add one to i as well
                i++;
            }
            else{
                // print out "Integers only please"
                System.out.println("Integers only, please.");
                input.nextLine();
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int total = adder();

        //after the loop is over
        //print the placeholder as total
        System.out.println("The total number is " + total + ".");
    }

}
