package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {
    public static Integer[] filterEvenNumbers(String numList[]){
        int temp;
        //Create a placeholder Array list
        ArrayList<Integer> placeholder = new ArrayList<>();
        //Create a for loop to look through every character in numList
        for(int i = 0; i < numList.length; i++){
            //convert each instance of the string to an int
            temp = Integer.parseInt(numList[i]);

            //Create an if statement to determine if the number is even (num % 2)
            if( temp % 2 == 0){
                //  if true add it to the placeholder array list
                placeholder.add(temp);
            }
        }
        //convert the array list to an int array and return it
        Integer[] returnList = new Integer[placeholder.size()];
        returnList = placeholder.toArray(returnList);

        return returnList;
    }

    public static void main(String[] args) {
        //create a scanner to take user input
        Scanner input = new Scanner(System.in);
        //Create a temp String to hold the user list
        String temp = "";
        //print statement asking the user to enter a list of numbers with spaces in between
        System.out.print("Enter a list of numbers, separated by spaces: ");
        //assign the user input to temp string
        temp = input.nextLine();
        //convert the temp string to a list array
        String unfiltered[] = temp.split(" ");
        //create a new array named evenList and set it equal to filterEvenNumbers(list)
        Integer filteredList[] = filterEvenNumbers(unfiltered);

        //Print out The even numbers are
        System.out.print("The even numbers are: ");
        //create a for loop to print each number with a space to the user
        for(int i = 0; i < filteredList.length; i++){
            //create an if statement for the last number of the array to place a period
            if(i < filteredList.length - 1){
                System.out.print(filteredList[i] + " ");
            }
            else{
                System.out.print(filteredList[i] + ".");
            }
        }
    }
}
