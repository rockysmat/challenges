package inheritancechallenge;

public class InheritanceChallenge {

    public static void main(String[] args) {
        Axela axela = new Axela(false, "Navy Blue", 1.50f);
        
        axela.accelerate(85);
        axela.accelerate(0);
        axela.accelerate(190);
        System.out.println("\n");
        
        axela.runAC();
        axela.startEngine();
        axela.stopEnging();
        System.out.println("\n");
        
        axela.setColor("red");
        axela.accelerate(115);
    }
    
}
