package baseline;

import java.util.Locale;
import java.util.Scanner;

public class Solution25 {

    public static int passwordValidator(String password){
        boolean hasNum = false;
        boolean hasChar = false;
        boolean hasSpecial = false;
        char temp;
        //declare variable to take in string length
        int pwLength = password.length();
        //set up two if statements one for >= 8 characters and one for <.
        if(pwLength < 8){
            //set up a for loop to go through each character of the string for both if statements
            for(int i = 0; i < pwLength; i++){
                temp = password.charAt(i);
                if(Character.isDigit(temp)){
                    //if it detects a number
                    hasNum = true;
                }
                else if(Character.isLetter(temp)){
                    //if it detects a character
                    hasChar = true;
                }
            }
            //if the pass has a num but not a char
            if(hasNum && !hasChar){
                return 1;
            }
            //if the pass has a char but not a num
            if(!hasNum && hasChar){
                return 2;
            }
            //if it doesn't pass either case it's unknown
            return 0;
        }
        //if the password is greater than 8 characters in length
        if(pwLength >= 8) {
            //set up a for loop to go through each character of the string for both if statements
            for(int i = 0; i < pwLength; i++){
                temp = password.charAt(i);
                if(Character.isDigit(temp)){
                    //if it detects a number
                    hasNum = true;
                }
                else if(Character.isLetter(temp)){
                    //if it detects a character
                    hasChar = true;
                }
                else if(!Character.isLetter(temp) && !Character.isDigit(temp)){
                    //if it detects a special character
                    //Could not find the command but not isLetter and not isDigit works!
                    hasSpecial = true;
                }
            }
            //if the pass has a num and char but not special char
            if(hasNum && hasChar && !hasSpecial){
                return 3;
            }
            //if the pass has all three conditions
            if(hasNum && hasChar && hasSpecial){
                return 4;
            }
            //if it doesn't pass either case it's unknown
            return 0;
        }
        //if it doesn't pass either case it's unknown
        return 0;
    }


    public static void main(String[] args) {
        String pass = "";
        String result = "";

        //Going to have to create a scanner
        Scanner input = new Scanner(System.in);
        //Ask user for their password
        System.out.print("What is your password? ");
        //Take in password in a String
        pass = input.nextLine();
        //call passwordValidator function within a switch
        switch(passwordValidator(pass)){
            //case 0 result = a password of unknown strength.
            case 0: result = "a password of unknown strength.";
                    break;
            //case 1 result = a very weak password.
            case 1: result = "a very weak password.";
                    break;
            //case 2 result = a weak password.
            case 2: result = "a weak password.";
                    break;
            //case 3 result = a strong password.
            case 3: result = "a strong password.";
                    break;
            //case 4 result = a very strong password.
            case 4: result = "a very strong password.";
                    break;
        }
        //A single print statement to print the password and the result
        System.out.println("The password '" + pass + "' is " + result);
    }
}
