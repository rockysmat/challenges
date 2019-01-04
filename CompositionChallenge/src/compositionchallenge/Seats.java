package compositionchallenge;

public class Seats {
    private String color;
    private int number;
    
    public Seats(String color, int number){
        this.color = color;
        this.number = number;
    }
    
    public void adjustSeat(){
        System.out.println("Seat is adjusting...");
    }
}
