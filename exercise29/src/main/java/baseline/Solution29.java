/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.Scanner;

public class Solution29 {
    public static int getRate(){
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //create a variable for rate and set it equal to 0
        int rate = 0;
        //create a boolean variable temp equal to true
        boolean temp = true;

        //create a do while loop with the parameter temp = true;
        do{
            //print the question, What is the rate of return?
            System.out.print("What is the rate of return? ");
            //if(input.hasNextInt())
            if(input.hasNextInt()){
                //set input equal to rate
                rate = input.nextInt();
                //another if statement to make sure it is greater than zero
                if(rate > 0){
                    return rate;
                }
                //else print out "Sorry. That's not a valid input."
                else{
                    System.out.println("Sorry. That's not a valid input.");
                    input.nextLine();
                }
            }
            else{
                // print out "Sorry. That's not a valid input."
                System.out.println("Sorry. That's not a valid input.");
                //and go to the next line to repeat the loop
                //until a valid answer is entered
                input.nextLine();
            }



        }while(temp = true);

        return rate;
    }

    public static void main(String[] args) {
        //create a variable for years and set it equal to 0
        int years = 0;
        //create a variable for rate and set it equal to getRate()
        int rate = getRate();
        //calculate years = 72 / rate
        years = 72 / rate;
        //print "It will take " + years + " years to double your initial investment."
        System.out.println("It will take " + years + " years to double your initial investment.");
    }
}
