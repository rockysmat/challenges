package numbertowords;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(2100);   
    }
    
    public static void numberToWords(int number){
        int reversedNumber = 0;
        
        if(number < 0){
            System.out.println("Invalid Value");
        }
        else {
        reversedNumber += reverse(number);
        int originalReversedNumber = reversedNumber;
        
        do{ 
            int lastDigit = reversedNumber % 10;
            reversedNumber /= 10;
            
            switch(lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
            }
        }
        while(reversedNumber > 0);
         
        if(getDigitCount(number) > getDigitCount(originalReversedNumber)){
            for(int i = 1; i <= (getDigitCount(number)-getDigitCount(originalReversedNumber)); i++){
                System.out.println("Zero");
            }
        }
      }
    }
   
    public static int reverse(int number){
        String reversedNumber = "";
        boolean isNegative = false;
        
        if(number < 0){
            isNegative = true;
            number *= -1;
        }
        do{
            int lastDigit = number % 10;
            number /= 10;
            reversedNumber += String.valueOf(lastDigit);
        }
        while(number > 0);
        if(isNegative)
            return (Integer.parseInt(reversedNumber) * -1);
        else
            return Integer.parseInt(reversedNumber);        
    }
    
    public static int getDigitCount(int number) {
        int count = 0;
        if(number < 0)
            return -1;
        if(number == 0) {
            count++;
            return count;
        }
        while(number > 0){
            count++;
            number /= 10;
        }
        return count;
    }    
}
