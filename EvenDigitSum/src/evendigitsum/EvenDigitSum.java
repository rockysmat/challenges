package evendigitsum;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(22316));
    }
    
    public static int getEvenDigitSum(int number){
        int lastDigit = 0;
        int sum = 0;
        
        if(number < 0)
            return -1;
        
        do {
            lastDigit = number % 10;
            if(lastDigit%2 == 0)
                sum += lastDigit;
            number /= 10;
        }
        while(number > 0);
        
        return sum;
    }
    
}
