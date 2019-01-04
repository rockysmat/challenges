package minandmaxinputchallenge;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
       
        int max = 0;
        int min = 0;
                
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter number: ");
            if(scan.hasNextInt()){
                int num = scan.nextInt();
                if(num > max){
                    max = num;
                    if(max < min)
                        min = max;      
                }
            }
            else {
                System.out.println("Maximum: "+max);
                System.out.println("Minimum: "+min);
                break;
            }
            scan.nextLine();
        }
        scan.close();
    }
}
