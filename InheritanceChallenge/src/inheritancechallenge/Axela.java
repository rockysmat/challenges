package inheritancechallenge;

public class Axela extends Car{
    private boolean isManual;
    private int wheels;
    private int cylinders;
    private int wipers;

    public Axela(boolean isManual, String color, float engineCapacity) {
        super(color, engineCapacity, "Axela", 4);
        this.isManual = isManual;
        this.wheels = 5;    //+ spare wheel
        this.cylinders = 4;
        this.wipers = 2;
    }
    
    public void runAC(){
        System.out.println(super.getName()+ " is running Air Conditioner");
    }
    
    public void accelerate(int speed){
        if(speed > 0 && speed <= 180)
            System.out.println("The "+super.getColor()+ " " +super.getName()+ " is moving at " +speed+ " KM/H");
        else if(speed > 180)
            System.out.println("The "+super.getColor()+ " " +super.getName()+ " is moving at maximu speed limit of 180 KM/H");
        else 
            System.out.println("The "+super.getColor()+ " " +super.getName()+ " is not moving");          
    }
    
    @Override
    public void startEngine(){
        System.out.println(super.getName()+ "'s engine is starting");
    }
}