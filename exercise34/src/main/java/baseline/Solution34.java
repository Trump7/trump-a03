/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.Scanner;

public class Solution34 {
    public static void printArray(String[] employee){
        //print "There are" + employee.length() + " employees:"
        System.out.println("\nThere are " + employee.length + " employees:");
        //create a for loop that is the length of employee array
        for(int i = 0; i < employee.length; i++){
            //print each of the items in the array
            System.out.println(employee[i]);
        }
    }

    public static String[] removeFromArray(String[] employee){
        Scanner input = new Scanner(System.in);
        //create a string variable to hold the removal name
        String removal = "";
        //Create a temp String array with length - 1
        String[] temp = new String[employee.length - 1];
        //print Enter an employee name to remove
        System.out.print("\nEnter an employee name to remove: ");
        //set the string variable equal to the users input
        removal = input.nextLine();
        //make a for loop (with i and a) no longer than the array length
        for(int i = 0, a = 0; i < employee.length; i++){
            //  if !array[i].equals(string variable)
            if(!employee[i].equals(removal)){
                //  temp[a++] = employee[i]
                temp[a++] = employee[i];
            }
        }
        //return temp array
        return temp;
    }

    public static void main(String[] args) {
        //initialize a String array with employee names:
        //John Smith, Jackie Jackson, Chris Jones, Amanda Cullen, Jeremy Goodwin
        String[] employee = new String[] {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        //call print array function with the employee string array as a parameter
        printArray(employee);

        //call removeFromArray function to prompt the user to delete an employee
        //Set removeFromArray equal to the original array
        employee = removeFromArray(employee);

        //call print array function again to show the new employee number and the current employees
        printArray(employee);
    }
}
