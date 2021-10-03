package baseline;

import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        int random = 0;
        //create an array with "Yes," "No," "Maybe," or "Ask again later."
        String[] magic8 = new String[] {"Yes", "No", "Maybe", "Ask again later"};
        //create a scanner for user input
        Scanner input = new Scanner(System.in);
        //ask the user what their question is
        System.out.println("What is your question? ");
        //take in user input to a temp variable
        String temp = input.next();
        //Select a random number between 0 and 3 and print said statement from the array
        random = (int)(Math.random() * 4);
        //print random line to user
        System.out.println(magic8[random]);
    }
}
