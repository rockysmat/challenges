package arraychallenge;

import java.util.Scanner;

public class ArrayChallenge {

    public static void main(String[] args) {
        printArray(sortIntegers(getIntegers()));
    }
    
    public static int[] getIntegers(){
        Scanner scan = new Scanner(System.in);
        int[] myArray = new int[6];
        int i = 0;
        //for(int i = 0; i < myArray.length; i++) {
        while(i < myArray.length){
            System.out.println("Enter Array Element #" +i);
            if(scan.hasNextInt()) {
                myArray[i] = scan.nextInt();
                i++;
            }
            else
                System.out.println("Please enter an integer");
        }
        return myArray;
    }
    
    public static void printArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i]+ "  ");
        }
    }
    
    public static int[] sortIntegers(int[] myArray){
        //for(int i = myArray.length - 1;  i > 0; i--){
        int tmp = 0;
        for(int i = 0;  i < myArray.length -1; i++){
            for(int j = 0; j < myArray.length -1 -i; j++){
                if(myArray[j + 1] > myArray[j]){
                    tmp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = tmp;
                }
            }                          
        }
        return myArray;
    }   
}
