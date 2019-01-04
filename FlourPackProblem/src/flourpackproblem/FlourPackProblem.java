package flourpackproblem;

public class FlourPackProblem {
    
    public static void main(String[] args) {
        System.out.println(canPack(2, 2, 12));
    }
      
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        else {
            if((bigCount * 5) >= goal && goal % 5 == 0)
                return true;
            else if(goal / 5 <= bigCount && goal % 5 <= smallCount)
                return true;
            else if((bigCount * 5) < goal && (bigCount * 5) + smallCount >= goal)
                return true;
            else
                return false;
        }
    }
}
