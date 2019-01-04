package polymorphismchallenge;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void startEngine(){
            System.out.println("Car Engine is starting...");
    }
    
    public void accelerate(){
        System.out.println("Car is accelerating...");
    }
    
    public void brake(){
        System.out.println("Car is braking...");
    }
}
