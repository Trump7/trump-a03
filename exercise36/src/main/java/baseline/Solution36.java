/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {
    public static double average(ArrayList<Integer> numberList){
        //create a temp variable to store result
        double temp = 0.0;
        //create a for loop to iterate through the array
        for(int num: numberList) {
            //add total += numberList[i]
            temp += num;
        }
        //divide the total by numberList.length() to get the average
        double average = temp / numberList.size();
        //return the average
        return average;
    }

    public static int max(ArrayList<Integer> numberList){
        //create max variable and assign it the first spot in the array
        int max = numberList.get(0);
        //create a for loop to iterate through the array
        for(int num: numberList) {
            //if numberList[i] > max
            if(num > max) {
                // set max equal to numberList[i]
                max = num;
            }
        }
        //and return max at the end
        return max;
    }

    public static int min(ArrayList<Integer> numberList){
        //create min variable and assign it the first spot in the array
        int min = numberList.get(0);
        //create a for loop to iterate through the array
        for(int num: numberList) {
            //if numberList[i] < min
            if(num < min) {
                // set min equal to numberList[i]
                min = num;
            }
        }
        //and return min at the end
        return min;
    }

    public static double std(ArrayList<Integer> numberList){
        //create a variable for the mean of the list and call the average function
        double average = average(numberList);
        //create a variable to hold the total
        double total = 0;
        //use a for loop to go through the whole list
        for(int num: numberList) {
            //Using part of the standard deviation equation inside the for loop
            total = total + Math.pow((num-average), 2);
        }
        //once outside the loop take the square root of the total
        double stdDev = Math.sqrt(total/numberList.size());
        //return the total value
        return stdDev;
    }

    public static void printResults(ArrayList<Integer> numberList){
        //print out numbers: followed by all numbers in the array
        System.out.println("Numbers: " + numberList.toString());
        //print out average (and call average function for result)
        System.out.println("The average is " + average(numberList));
        //print out min (and call min function for result)
        System.out.println("The minimum is " + min(numberList));
        //print out max (and call max function for result)
        System.out.println("The maximum is " + max(numberList));
        //print out std (and call std function for result)
        System.out.println("The standard deviation is " + String.format("%.2f", std(numberList)));
    }

    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Create an integer arrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //Create a temp string for user input
        String temp = "";

        //create a do while loop
        do {
            //  print user to enter number
            System.out.print("Enter a number: ");
            //  store number in temp
            temp = input.next();

            //  if the temp string is not equal to "done"
            if (!temp.equals("done")) {
                //     try to parse the int into another int placeholder
                try {
                    //  Check to make sure the number is an int
                    int num = Integer.parseInt(temp);
                    //     if that works store it in the arraylist
                    numbers.add(num);
                } catch (NumberFormatException nfe) {
                    //  if not return invalid input and start from top of loop
                    System.out.println("Invalid Input, try again.");
                }

            }
            //end loop with while condition of not temp.equals("done")
        }while(!temp.equals("done"));

        // call print results function

        printResults(numbers);
    }
}
