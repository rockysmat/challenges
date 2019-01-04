package playwithmethods;

public class PlayWithMethods {

    public static void main(String[] args) {
    double centimeters = calcFeetAndInchesToCentimeters(1670);
        System.out.println(centimeters);
    }
    
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0){
            double feet = (int)inches/12;
            inches %= 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        }
        else return -1;
    }
    
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0 && (inches >=0 && inches <= 12)) {
            double centimeters = feet * 12 * 2.54 + inches * 2.54;
            return centimeters;
        }
        else 
            return -1;
    }
}