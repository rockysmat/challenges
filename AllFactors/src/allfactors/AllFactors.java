package allfactors;

public class AllFactors {

    public static void main(String[] args) {
        printFactors(10);
    }
    
    public static void printFactors(int number){
        int i = 1;
        if(number < 1)
            System.out.println("Invalid Value");
        
        while(i <= number){
            if(number % i == 0){
                System.out.print(String.valueOf(i)+ " ");
            }
            i++;
        }
    }
    
}
