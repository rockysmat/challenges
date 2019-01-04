package perfectnumber;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(1));
    }
    
    public static boolean isPerfectNumber(int number){
        int i = 1;
        int sum = 0;
        if(number < 1)
            return false;
        while(i <= number/2){
            if(number % i == 0)
                sum += i;
            i++;
        }
        return (number == sum);
    }
}
