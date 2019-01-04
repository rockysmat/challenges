package compositionchallenge;

public class Engine {
    private int cylinders;
    private float capacity;
    private String configuration;

    public Engine(int cylinders, float capacity) {
        this.cylinders = cylinders;
        this.capacity = capacity;
        this.configuration = "V6";
    }
    
    public void startEngine(){
        System.out.println("Engine is starting...");
    }
    
    public void stopEngine(){
        System.out.println("Engine is stopping");
    }
}
