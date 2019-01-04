package sum3and5challenge;

public class Sum3And5Challenge {

    public static void main(String[] args) {
        int total = 0;
        int j = 0;
        
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i+ " is divisible by both 3 & 5");
                j++;
                total +=i;
            }
            if(j == 5){
                break;
            }
        }
        System.out.println("The total is " +total);
    }
    
}
