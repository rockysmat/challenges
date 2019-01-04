package numberpalindrome;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        
    }
    
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;    
        boolean sign = false;
        
        if(number < 0) {
            sign = true;
            number *= -1;
        }
        
        do{
            int lastDigit = number % 10;  
             number /= 10;  
            reverse = (reverse * 10) + lastDigit;
        }
        while(number > 0);
        
        if(sign){
            reverse *= -1;
        }
        return(originalNumber == reverse);
    }
}
