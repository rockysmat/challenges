package reversedarraychallenge;

import java.util.Arrays;

public class ReversedArrayChallenge {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        reverse(myArray);
    }
    
    public static void reverse(int[] myArray){
        int tmp = 0;
        int[] reversedArray = new int[myArray.length];
        for(int i = 0; i < myArray.length; i++){
            tmp = myArray[i];
            reversedArray[myArray.length-1-i] = tmp;
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(reversedArray));
    }
    
}
