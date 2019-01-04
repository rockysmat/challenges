package inheritancechallenge;

public class Car extends Vehicle{
    private String color;
    private float engineCapacity;
    private String name;

    public Car(String color , float engineCapacity, String name, int doors) {
        super("land", doors);
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.name = name;
    }
  
    public void startEngine(){
        System.out.println("Car engine is starting..");
    }
    
    public void acclerate(int speed){
        System.out.println("The car of" +engineCapacity+ "L engine capacity is moving at " +speed+ "KM/H");
    }
    
    public void stopEnging(){
        System.out.println(name+ " engine is stopping...");
    }
    
    public String getName(){
        return this.name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
 
}
