package minelementchallenge;

import java.util.Scanner;

public class Main {
    
    private static Scanner scan; 
    
    public static void main(String[] args) {
        System.out.println(findMin(readIntegers(5)));
    }
    
    public static int[] readIntegers(int count){
        int[] myArray = new int[count];
        int i = 0;
        System.out.println("Enter Array Elements:");
        scan = new Scanner(System.in);
        while(i < count){
           myArray[i] = scan.nextInt();
           i++;
        }
        return myArray;
    }
    
    public static String findMin(int[] myArray){
        int min = myArray[0];
        for(int i = 0; i < myArray.length - 1; i++){
            if(min > myArray[i+1])
                min = myArray[i+1];
        }
        return "Minimum value: " +min;
    }
}
