/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

public class Solution30 {
    public static String table = "";

    public static void makeTable() {
        //initialize two variables i and a for the for loops
        int i;
        int a;
        //create a for loop (for i) that starts at one and is <= 12
        for(i = 1; i <= 12; i++){
            //  within that for loop make another (for a) that starts at one and is <= 12
            for(a = 1; a <= 12; a++){
                //  also add a character (i * a) to the table string
                table = table + String.format("%4d", i * a);
            }
            table = table + "\n";
        }
    }

    public static void main(String[] args) {
        //Call makeTable to add the necessary digits to String table
        makeTable();
        //this command prints out the multiplication table
        System.out.println(table);
    }
}
