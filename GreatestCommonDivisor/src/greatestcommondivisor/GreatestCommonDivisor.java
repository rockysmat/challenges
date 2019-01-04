package greatestcommondivisor;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println("The GCD is: " +getGreatestCommonDivisor(9, 18));
    }
    
    public static int getGreatestCommonDivisor(int first, int second){
 
        if(first < 10 || second < 10)
            return -1;
        
        if(first >= second){
            if(first % second == 0)
                return second;
            else {
                for(int i = second/2; i > 0; i--) {
                    if (first % i == 0 && second % i == 0)
                        return i;
                }
            }
        }
        else {
            if(second % first == 0)
                return first;
            else {
                for(int i = first/2; i > 0; i--) {
                    if (first % i == 0 && second % i == 0)
                        return i;
                }
            }
        }
        return -1;
    }
    
}
