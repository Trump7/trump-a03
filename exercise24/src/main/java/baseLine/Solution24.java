/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matthew Trump
 *
 *  This program will take in two strings from the user
 *  and figure out if they are anagrams.
 */
package baseLine;

import java.util.Scanner;
import java.util.Arrays;

public class Solution24 {
    //isAnagram returns a true or false given if both strings are anagrams
    public static boolean isAnagram(String string1, String string2){
        //Declare variables for the length of both string's
        //int str1 = string1.length()
        int stringLength1 = string1.length();
        int stringLength2 = string2.length();

        //Check if both strings are same length
        // if str1 != str2 return false
        if(stringLength1 != stringLength2){
            return false;
        }
        //Sort the strings in alphabetical order and lowercase all chars
        char[] str1 = string1.toLowerCase().toCharArray();
        char[] str2 = string2.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        //return whether the strings are equal.
        return Arrays.equals(str1, str2);
    }

    public static void main(String[] args) {
        //Declare two chars for user input
        String str1;
        String str2;
        //Declare a string named result
        String result;

        //Scan user input for string1 and string2
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        str1 = in.nextLine();
        System.out.print("Enter the second string: ");
        str2 = in.nextLine();

        /*
        call if(isAnagram(str1, str2))
        if true set result to "are anagrams"
        else set result to "are not anagrams"
        */
        if(isAnagram(str1, str2)){
            result = " are anagrams.";
        }
        else{
            result = " are not anagrams.";
        }

        //print both strings and the result
        System.out.println(str1 + " and " + str2 + result);
    }
}
