package compositionchallenge;

public class Wheels {
    private int number;
    private int size;
    private boolean tubeless;

    public Wheels(int number, int size) {
        this.number = number;
        this.size = size;
        this.tubeless = true;
    }
    
    public void move(){
        System.out.println("Wheels are rotating...");
    }
    
    public void skid(){
        System.out.println("Wheels are skidding...");
    }
    
}
