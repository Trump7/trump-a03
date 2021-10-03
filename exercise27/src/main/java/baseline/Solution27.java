/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

public class Solution27 {
    //create an output string and set it equal to ""

    public void validateFirstName(String firstName){
        //create a temp boolean variable
        //if(firstName.length() < 2)
        // set temp = false
        // set output = "The first name must be at least 2 characters long.\n"
        //if(lastName.length() = 0)
        // set temp = false
        // set output = "The last name must be filled in.\n"
        //return the temp boolean value
    }

    public void validateLastName(String lastName){
        //create a temp boolean variable
        //if(lastName.length() < 2)
        // set temp = false
        // set output = "The last name must be at least 2 characters long.\n"
        //if(lastName.length() = 0)
        // set temp = false
        // set output = "The last name must be filled in.\n"
        //return the temp boolean value
    }

    public void validateZip(String zip){
        //create a temp boolean variable
        //try to turn String zip into an integer
        //if that fails it means there is a different character in there
        // set temp to false
        // set output = "The zip code must be a 5-digit number.\n"
        //if that does not fail, zip.length() has to be equal to 5
        // if not set temp to false and the output to the same as before
        //return the temp boolean value
    }

    public void validateID(String id){
        //create a temp boolean variable
        // Use regex to make a template for how the id should look
        //if template does not match the string id
        // set temp = false
        // set output = "The employee ID must be in the format of AA-1234."
        //return the temp boolean value
    }

    public void validateInput(String firstName, String lastName, String zip, String id){
        //make four boolean variables for all parameters
        //call each validate function with its corresponding
        // String and set them equal to their boolean variable

        //if(firstName == true && lastName == true && zip == true && id == true)
        //Then change output string to "There were no errors found"
        //print output outside the if statement
    }

    public static void main(String[] args) {
        //Create a scanner for user input
        //Create four strings to hold all the input data
        //Make four print statements, with corresponding scanner in statements
        //asking for first name, last name, zip, and ID
        //call validateInput with all four parameters
    }
}
