/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {

    public static ArrayList<String> getNames(){
        //Create a scanner for user input
        Scanner input = new Scanner(System.in);
        //Create a String temp variable
        String temp;
        //Create an arrayList to hold all the names
        ArrayList<String> tempNames = new ArrayList<String>();
        //Make a do while loop
        do{
            //  print Enter a name:
            System.out.print("Enter a name: ");
            //  set user input equal to temp variable
            temp = input.nextLine();

            // if the temp variable is not blank
            if(!temp.isBlank() && !temp.isEmpty()){
                tempNames.add(temp);
            }
        }while(!temp.isBlank() && !temp.isEmpty());

        //return arraylist
        return tempNames;
    }
    public static int generateNum(ArrayList<String> list){
        //Create a random constructor
        Random random = new Random();
        //Create a placeholder int
        int placeholder = random.nextInt(list.size());
        //set placeholder equal to the random spot in the array
        //return placeholder int
        return placeholder;
    }

    public static void main(String[] args) {
        //Create a new array list
        ArrayList<String> names = new ArrayList<String>();
        //Create an int named randoNum
        int randoNum = 0;
        //call getNames and set it equal to the new array list
        names = getNames();
        //call generateNum and set it equal to randoNum
        randoNum = generateNum(names);
        //Print the random name is the list of names
        System.out.println("The winner is ... " + names.get(randoNum) + ".");
    }
}
