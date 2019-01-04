package compositionchallenge;

public class CompositionChallenge {

    public static void main(String[] args) {
        
        Engine engine = new Engine(4, 2.0f);
        Wheels wheels = new Wheels(4, 21);
        
        Car car = new Car(engine, wheels, new Seats("Black", 4));
        
        car.getEngine().startEngine();
        car.getEngine().stopEngine();
        System.out.println("\n");
        
        wheels.move();
        wheels.skid();
        System.out.println("\n");
        
        car.startCar();
        new Seats("Black", 4).adjustSeat();      
    }
    
}
