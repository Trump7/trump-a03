/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.Scanner;

public class Solution32 {
    public static int randomNumber(int difficulty){
        int randomNum = 0;
        //make an if statement for if difficulty = 1
        if(difficulty == 1){
            //return a random number between 1 and 10
            randomNum = (int)(Math.random() * 10 + 1);
        }
        //make an if statement for if difficulty = 2
        else if(difficulty == 2){
            //return a random number between 1 and 100
            randomNum = (int)(Math.random() * 100 + 1);
        }
        //make an if statement for if difficulty = 3
        else if(difficulty == 3){
            //return a random number between 1 and 1000
            randomNum = (int)(Math.random() * 1000 + 1);
        }
        return randomNum;
    }

    public static int guessingGame(int random){
        Scanner input = new Scanner(System.in);

        //Create a variable named guess
        int guess = 0;
        //Create a variable named counter
        int counter = 0;

        //Print out "I have my number. What's your guess?: "
        System.out.print("I have my number. What's your guess?: ");
        do{
            //create an if statement if input.hasnextint
            if(input.hasNextInt()){
                //  if true, set guess equal to input.nextInt
                guess = input.nextInt();
                //  add one to counter
                counter++;

                if(guess == random){
                    break;
                }
                if(guess < random){
                    System.out.print("Too low, guess again: ");
                }
                if(guess > random){
                    System.out.print("Too high, guess again: ");
                }
            }
            else{
                counter++;
                System.out.print("Invalid character(s), guess again: ");
                input.nextLine();
            }
        }while(guess != random);
        return counter;
    }


    public static void main(String[] args) {
        boolean temp = false;
        //Create a variable named difficulty
        int difficulty = 0;

        //Create a variable named random
        int random;
        //Create a scanner for user input
        Scanner input = new Scanner(System.in);

        //Print the title of the game to the screen
        System.out.println("Let's play Guess the Number!\n");
        //Create a while loop
        while(true){
            while(!temp){
                //Ask the user what level of difficulty they want
                System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
                //set difficulty equal to that number only if it is an integer
                if(input.hasNextInt()){
                    difficulty = input.nextInt();
                    temp = true;
                } else{
                    System.out.println("Invalid character, please try again.");
                    input.nextLine();
                }
            }
            temp = false;
            //call random = randomNumber(difficulty)
            random = randomNumber(difficulty);

            int counter = guessingGame(random);

            System.out.println("You got it in " + counter + " guesses!");

            //outside of the while loop
            // ask the user if they want to play again.
            System.out.print("\nDo you wish to play again?(Y/N) ");
            String again = input.next();
            if(again.equals("N") || again.equals("n")){
                //  if no break and end the program
                break;
            }
        }
    }
}
