package com.largestprime;

public class ComLargestPrime {

    public static void main(String[] args) {
        System.out.println("The Largest Prime factor is: " +getLargestPrime(21));
    }
    
//    public static int getLargestPrime(int number){
//        if(number < 2)
//            return -1;
//        else{
//            for(int i = number; i >= 2; i--){
//                if(number % i == 0 && isPrime(i))
//                    return i;
//            }
//        }
//        return -1;
//    }
    
//    public static boolean isPrime(int num){
//        
//        for(int i=2; i<=num/2; i++) {
//            if(num % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
    
    public static int getLargestPrime(int number) {
        
        if (number <= 1) {
            return -1;
        }
        
        int largestPrime = 0;
 
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 2; j <= i ; j++) {
                    if (i % j == 0) {
                        if (j >= i) {
                            largestPrime = j;
                        }
                        break;
                    }
                }
            }
        }
        return largestPrime;
    }
}
