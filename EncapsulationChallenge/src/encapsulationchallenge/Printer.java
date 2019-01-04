package encapsulationchallenge;

public class Printer {
    private float tonerLevel;
    private int printedPages;
    private boolean isDuplex;
    
    public Printer(float tonerLevel, int printedPages){
        this.tonerLevel = tonerLevel;
        this.printedPages = printedPages;
        this.isDuplex = false;
    }
    
    public void addToner(float tonerLevel){
        if((this.tonerLevel += tonerLevel) <= 100)
            System.out.println("Toner added successfully. New level is: " +this.tonerLevel+ "%");
        else 
            System.out.println("Toner level cannot exceed 100%. Current toner level: "+(this.tonerLevel -= tonerLevel));
    }
    
    public void printing(int printedPages){
        this.printedPages += printedPages;
        System.out.println("You have printed a total of " +this.printedPages+ " pages");
    }

    public void setTonerLevel(float tonerLevel) {
        if(tonerLevel <= 100.00){
            this.tonerLevel = tonerLevel;
        }
        else System.out.println("Toner level cannot exceed 100%.");
    }

    public void setPrintedPages(int printedPages) {
        this.printedPages = printedPages;
    }
    
    public float getTonerLevel(){
        return this.tonerLevel;
    }
    
    public int getPrintedPages(){
        return this.printedPages;
    }
}
