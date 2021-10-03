/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution37 {
    public static String generatePassword(int minLength, int special, int nums){
        //Initialize Random()
        Random random = new Random();
        //Initialize a string for password
        String password = "";

        //list for special characters
        List<Character> specialList = new ArrayList<>();
        String specialChars = "!@#&()–[{}]:;'?/*$^+=<>";
        for(char ch: specialChars.toCharArray()){
            specialList.add(ch);
        }

        //List for numbers
        List<Character> numberList = new ArrayList<>();
        String numbers = "0123456789";
        for(char ch: numbers.toCharArray()){
            numberList.add(ch);
        }

        //List for letters
        List<Character> letterList = new ArrayList<>();
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(char ch: letters.toCharArray()){
            letterList.add(ch);
        }


        //Add a for loop to add random letters
        for(int i = 0; i < (minLength - special - nums); i++){
            password = password + letterList.get(random.nextInt(letterList.size()));
        }
        //Conditions must be < length - special - numbers

        //Add a for loop to add random special characters
        //Condition must be < special
        for(int i = 0; i < special; i++){
            password = password + specialList.get(random.nextInt(specialList.size()));
        }

        //Add a for loop to add random numbers
        //Condition must be < numbers
        for(int i = 0; i < nums; i++){
            password = password + numberList.get(random.nextInt(numberList.size()));
        }

        //Add a nested for loop that mixes all the numbers, letters, and special characters around
        char mixer[] = password.toCharArray();
        //Goes down from total length to 1
        for(int i = (mixer.length - 1); i > 0; i--){
            int a = random.nextInt(i + 1);
            //Swapping i and i + 1 every iteration
            char temp = mixer[i];
            mixer[i] = mixer[a];
            mixer[a] = temp;
        }
        //After mixing up the variables set it equal to password
        password = new String(mixer);

        //return String password
        return password;
    }

    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Create variable int special
        int special = 0;
        //Create variable int length
        int length = 0;
        //Create variable int numbers
        int numbers = 0;

        //Ask user for the minimum length
        System.out.print("What is the minimum length? ");
        //Set that value equal to length
        length = input.nextInt();
        //Ask user for the # of special characters
        System.out.print("How many special characters? ");
        //Set that value equal to special
        special = input.nextInt();
        //Ask user for the # of numbers
        System.out.print("How many numbers? ");
        //Set that value equal to numbers
        numbers = input.nextInt();

        //Set String password equal to generatePassword(length, special, numbers)
        String password = generatePassword(length, special, numbers);
        //Print the randomly generated password
        System.out.println("Your password is " + password);

    }
}
