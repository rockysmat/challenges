package polymorphismchallenge;

public class Mazda extends Car{

    public Mazda() {
        super("Mazda", 4);
    }
    
    @Override
    public void accelerate(){
        System.out.println(super.getName()+ " is accelerating...");
    }
    
    @Override
    public void brake(){
        System.out.println(super.getName()+ " is braking...");
    }
    
    @Override
    public void startEngine(){
            System.out.println(super.getName()+ " engine is starting...");
    }
}
