package polymorphismchallenge;

public class PolymorphismChallenge {

    public static void main(String[] args) {
       Audi audi = new Audi();
       audi.startEngine();
       audi.accelerate();
       audi.brake();
       System.out.println("\n");
        
       GenericCar genericCar = new GenericCar();
       genericCar.startEngine();
       genericCar.accelerate();
       genericCar.brake();
       System.out.println("\n");
       
       Mazda mazda = new Mazda();
       mazda.startEngine();
       mazda.accelerate();
       mazda.brake();
    } 
}

