package encapsulationchallenge;

public class EncapsulationChallenge {

    public static void main(String[] args) {
        Printer printer = new Printer( 68.50f, 18);
        
        printer.setTonerLevel(100.50f);
        printer.setPrintedPages(5);
        
        printer.addToner(50.00f);
        printer.printing(10);
        
//        System.out.println("Current Toner Level: " +printer.getTonerLevel());
//        System.out.println("Total Printed Pages are: " +printer.getPrintedPages());
        
    }
}
