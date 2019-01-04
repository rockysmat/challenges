package flowcontrolexcercises;

public class FlowControlExcercises {
    
    public static void main(String[] args) {
       int j = 0;
       for(int i = 777; i <= i; i++){
           if(isPrime(i)){
               System.out.println(i);
               j++;
           }
           if(j == 3) {
           break;
           }
       }
        //System.out.println(isPrime(4));
    }
    
    public static boolean isPrime(int num) {
        if(num == 1){
            return false;
        }
        for(int i=2; i<=num/2; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
