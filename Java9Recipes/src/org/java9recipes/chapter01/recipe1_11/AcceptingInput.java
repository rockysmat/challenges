package org.java9recipes.chapter01.recipe1_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingInput {
    public static void main(String[] args){
        BufferedReader readIn = new BufferedReader(
                new InputStreamReader(System.in));
        String numberAsString = "";
        long numberAsLong = 0;
        boolean numberIsValid = false;
        
        do {
        System.out.println("Please enter a number: ");
        try {
            numberAsString = readIn.readLine();
            System.out.println("You entered " +numberAsString);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        try {
            numberAsLong = Long.parseLong(numberAsString);
            numberIsValid = true;
        }
        catch (NumberFormatException nfe) {
         System.out.println("Not a number! " +nfe );
        }
        }
        while (numberIsValid == false);
    }
}
