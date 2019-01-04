package shareddigit;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println("Do the numbers share at least one digit? : " +hasSharedDigit(9, 9));
    }
    
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 0 || num2 > 99)
            return false;
        int lastDigit1 = num1 % 10;
        num1 /= 10;
        int lastDigit2 = num2 % 10;
        num2 /= 10;
        
        return (lastDigit1 == lastDigit2 || lastDigit1 == num2 || num1 == lastDigit2 || num1 == num2);      
    }
}
