/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.Scanner;

public class Solution31 {
    public static String table = "";

    public static int getTargetHeartRate(int restingHeartRate, int age, int intensity){
        //create an int variable for targetHeartRate
        double targetHeartRate = 0;
        //targetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        targetHeartRate = (((220 - age) - restingHeartRate) * (intensity/100.0)) + restingHeartRate;
        //rounding the target heart rate because it is currently a double
        return (int)Math.round(targetHeartRate);
    }

    public static void generateTable(int restingHeartRate, int age){
        //Add their resting rate and age to the top
        table = table + String.format("Resting pulse: %d\t\tAge: %d\n\n", restingHeartRate, age);
        //Add the header to the table "Intensity | Rate"
        table = table + "Intensity\t| Rate\n";
        //add a line separating the header from the table
        table = table + "------------|----------\n";
        //make a for loop starting from 55 going up to 95 with i + 5
        for(int i = 55; i <= 95; i += 5){
            //add i % to the left side then
            //after the pipe (|) call getTargetHeartRate(restingHeartRate, age, i/100.0)
            table = table + String.format("%d%%\t\t\t| %2d bpm\n", i, getTargetHeartRate(restingHeartRate,age, i));
        }
    }

    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Create two variables: one for resting heart rate and one for age
        int restingHeartRate = 0;
        int age = 0;
        //create a boolean temp set equal to true
        boolean temp = true;
        //create a boolean temp1 set equal to true
        boolean temp1 = true;

        //create a do while loop
        do{
            //Prompt user to enter heart rate
            System.out.print("What is your resting heart rate? ");
            //if(input.hasNextInt()
            if(input.hasNextInt()){
                //store input in heart rate variable
                restingHeartRate = input.nextInt();
                if(restingHeartRate > 0){
                //temp = false
                temp = false;
                }
                else{
                    System.out.println("Please enter a valid heart rate");
                    input.nextLine();
                }
            }
            else{
                System.out.println("Please enter a valid heart rate");
                input.nextLine();
            }
        }while(temp);
        //create a do while loop
        do{
            //Prompt user to enter age
            System.out.print("What is your age? ");
            //if(input.hasNextInt()
            if(input.hasNextInt()){
                //store input in age variable
                age = input.nextInt();
                if(age > 0){
                    //temp = false
                    temp1 = false;
                }
                else{
                    System.out.println("Please enter a valid heart rate");
                    input.nextLine();
                }
            }
            else{
                System.out.println("Please enter a valid heart rate");
                input.nextLine();
            }
        }while(temp1);

        //Pass heart rate and age to generateTable
        generateTable(restingHeartRate, age);

        //Print the table
        System.out.println(table);
    }
}
