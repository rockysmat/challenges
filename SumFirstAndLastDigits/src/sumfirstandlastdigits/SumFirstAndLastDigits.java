
package sumfirstandlastdigits;

public class SumFirstAndLastDigits {

    public static void main(String[] args) {
        System.out.println("The sum of first & last digits is: " +sumFirstAndLastDigit(0));
    }
    
    public static int sumFirstAndLastDigit(int number) {
        
        int firstDigit = 0;
        int sum = number % 10;
                    
        if(number < 0){
            return -1;
        }
        
        if(number > 0 && number < 10){
                return number * 2;
            }
        
        do {
            number /= 10;
            if(number > 0 && number < 10){
                firstDigit = number; 
            }
            
        }
        while(number > 0);
        return sum += firstDigit;        
    }
    
}
