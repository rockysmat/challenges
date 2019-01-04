package compositionchallenge;

public class Car {
    private Engine engine; // = new Engine(4, 2.0f);
    private Wheels wheels; // = new Wheels(4, 21);
    private Seats seats;

    public Car(Engine engine, Wheels wheels, Seats seats) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
    }
    
    public void startCar(){
        engine.startEngine();
        wheels.move();
    }
    
    public Engine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public Seats getSeats() {
        return seats;
    }
    
}
