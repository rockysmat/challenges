package minutesandsecondschallenge;

import java.text.DecimalFormat;

public class MinutesAndSecondsChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(365, 45));
        System.out.println(getDurationString(21945));
    }
    
    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && (seconds >= 00 && seconds <= 59)){
           int hours = minutes / 60;
           minutes %= 60;
           DecimalFormat df = new DecimalFormat("00");
           return df.format(hours)+"h "+df.format(minutes)+"m "+df.format(seconds)+"s ";  
        } 
        else 
            return "Invalid value";
    }
    
    public static String getDurationString(int seconds){
        if(seconds >= 0){
           int minutes = seconds / 60;
           seconds %= 60;
           return getDurationString(minutes, seconds);
        }
        else 
            return "Invalid value";
    }
}
