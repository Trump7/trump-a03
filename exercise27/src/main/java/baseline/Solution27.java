/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution27 {
    //create an output string and set it equal to ""
    static String output = "";

    public static boolean validateFirstName(String firstName){
        //create a temp boolean variable
        boolean temp = true;
        if(firstName.length() < 2){
            // set temp = false
            temp = false;
            // set output = "The first name must be at least 2 characters long.\n"
            output = output + "The first name must be at least 2 characters long.\n";
        }
        if(firstName.length() == 0){
            // set temp = false
            temp = false;
            // set output = "The first name must be filled in.\n"
            output = output + "The first name must be filled in.\n";
        }
        //return the temp boolean value
        return temp;
    }

    public static boolean validateLastName(String lastName){
        //create a temp boolean variable
        boolean temp = true;
        if(lastName.length() < 2){
            // set temp = false
            temp = false;
            // set output = "The last name must be at least 2 characters long.\n"
            output = output + "The last name must be at least 2 characters long.\n";
        }
        if(lastName.length() == 0){
            // set temp = false
            temp = false;
            // set output = "The last name must be filled in.\n"
            output = output + "The last name must be filled in.\n";
        }
        //return the temp boolean value
        return temp;
    }

    public static boolean validateZip(String zip){
        //create a temp boolean variable
        boolean temp = true;
        //try to turn String zip into an integer
        try{
            int tempZip = Integer.parseInt(zip);
            //if that does not fail, zip.length() has to be equal to 5
            if(zip.length() != 5){
                // if not set temp to false and the output to the same as before
                temp = false;
                output = output + "The zip code must be a 5-digit number.\n";
            }
        }catch(Exception e){
            //if that fails it means there is a different character in there
            // set temp to false
            temp = false;
            // set output = "The zip code must be a 5-digit number.\n"
            output = output + "The zip code must be a 5-digit number.\n";
        }
        //return the temp boolean value
        return temp;
    }

    public static boolean validateID(String id){
        //create a temp boolean variable
        boolean temp = true;
        // Use regex to make a template for how the id should look
        //Any Capital or Lowercase 2 letters with 1 hyphen and any four numbers range (0 to 9)
        String template = "[a-zA-Z]{2}[-][0-9]{4}";
        //if template does not match the string id
        if(!Pattern.matches(template, id)){
            // set temp = false
            temp = false;
            // set output = "The employee ID must be in the format of AA-1234."
            output = output + "The employee ID must be in the format of AA-1234.\n";
        }
        //return the temp boolean value
        return temp;
    }

    public static void validateInput(String firstName, String lastName, String zip, String id){
        //make four boolean variables for all parameters
        boolean isfName;
        boolean islName;
        boolean isZip;
        boolean isID;
        //call each validate function with its corresponding
        // String and set them equal to their boolean variable
        isfName = validateFirstName(firstName);
        islName = validateLastName(lastName);
        isID = validateID(id);
        isZip = validateZip(zip);

        //if all values are true
        if(isfName && islName && isZip && isID){
            //Then change output string to "There were no errors found"
            output = "There were no errors found";
        }
        //print output outside the if statement
        System.out.print(output);
    }

    public static void main(String[] args) {
        //Create a scanner for user input
        Scanner input = new Scanner(System.in);
        //Create four strings to hold all the input data
        String firstName;
        String lastName;
        String zip;
        String id;
        //Make four print statements, with corresponding scanner in statements
        //asking for first name, last name, zip, and ID
        System.out.print("Enter the first name: ");
        firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        lastName = input.nextLine();
        System.out.print("Enter the zip: ");
        zip = input.nextLine();
        System.out.print("Enter the id: ");
        id = input.nextLine();
        //call validateInput with all four parameters
        validateInput(firstName, lastName, zip, id);
    }
}
