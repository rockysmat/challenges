package lastdigitchecker;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(21, 16, 56));
    }
    
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000)
            return false;
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;
        
        return (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3);
    }
}
