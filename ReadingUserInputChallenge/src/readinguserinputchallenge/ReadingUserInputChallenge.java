package readinguserinputchallenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
       int count = 1;
       int sum = 0;
       Scanner scan = new Scanner(System.in);
       
       while(count <= 10){
           System.out.println("Enter Number #" +count);
           if(scan.hasNextInt()) {
               sum += scan.nextInt();
               count++;
           }
           else
               System.out.println("Invalid Number");
           scan.nextLine();
       }
       scan.close(); 
        System.out.println("The sum of all input numbers is: " +sum);
    }   
}
