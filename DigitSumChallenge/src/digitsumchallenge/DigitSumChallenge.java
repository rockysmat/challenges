package digitsumchallenge;

public class DigitSumChallenge {
    
    public static void main(String[] args) {
        System.out.println(sumDigits(0));
    }
    
    public static int sumDigits(int number){
      int sum = 0;            
      if(number < 10 ){
          return -1;
      }
      else {
          do{
              int singleDigit = number % 10;
              number /= 10;
              sum += singleDigit;
          }
          while(number > 0);    
      }
      return sum;
    }
}
