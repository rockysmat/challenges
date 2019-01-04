package morecodingexamples;

public class MoreCodingExamples {
    //private static final double PI = 3.14159;
    
    public static void main(String[] args) {
        //boolean playing = isCatPlaying();
        System.out.println(isCatPlaying(false, 35));
    }
    
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer) {
            if(temperature >= 25 && temperature <= 45) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if(temperature >= 25 && temperature <= 35) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
