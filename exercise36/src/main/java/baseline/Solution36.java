/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.ArrayList;

public class Solution36 {
    public static double average(ArrayList<Integer> numberList){
        //create a temp variable to store result
        //create a for loop to iterate through the array
        //add total += numberList[i]
        //divide the total by numberList.length() to get the average
        //return the average
    }

    public static int max(ArrayList<Integer> numberList){
        //create max variable and assign it the first spot in the array
        //create a for loop to iterate through the array
        //if numberList[i] > max
        // set max equal to numberList[i]
        //and return max at the end
    }

    public static int min(ArrayList<Integer> numberList){
        //create min variable and assign it the first spot in the array
        //create a for loop to iterate through the array
        //if numberList[i] < min
        // set min equal to numberList[i]
        //and return min at the end
    }

    public static double std(ArrayList<Integer> numberList){
        //create a variable for the mean of the list and call the average function
        //create a variable to hold the total
        //use a for loop to go through the whole list
        //Using part of the standard Deiviation equation inside the for loop
        //once outside the loop take the square root of the total
        //return the total value
    }
    public static void printResults(ArrayList<Integer> numberList){
        //print out numbers: followed by all numbers in the array
        //print out average (and call average function for result)
        //print out min (and call min function for result)
        //print out max (and call max function for result)
        //print out std (and call std function for result)
    }

    public static void main(String[] args) {
        //Create a scanner
        //Create an integer arrayList
        //Create a temp string for user input

        //create a do while loop
        //  Check to make sure the number is an int
        //  if not return invalid input and start from top of loop
        //  print user to enter number
        //  store number in temp
        //
        //  if the temp string is not equal to "done"
        //     try to parse the int into another int placeholder
        //     if that works store it in the arraylist
        //     if that doesn't work throw an exception that does not add it to the list
        //end loop with while condition of not temp.equals("done")
        //
        // call print results function
    }
}
