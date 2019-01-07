package billsburger;

    public class HealthyBurger extends Burger {
    
    private String lettuce;
    private final double lettucePrice = 25.00;
    private String tomatoes;
    private final double tomatoesPrice = 15.00;
    private double healthyBurgerPrice;
    private String burgerName = "Healthy Burger";
    private double totalBurgerPrice;
    private String message = "Lettuce Ksh. " +this.lettucePrice+ "\nTomatoes Ksh. " +this.tomatoesPrice+ "\n";

    public HealthyBurger(String lettuce, String tomatoes) {
        super();
        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.healthyBurgerPrice = 350;
        this.totalBurgerPrice = healthyBurgerPrice;
    }
    
    @Override
    public void processOrder(){
        boolean flag = true;
        int i = 0;
        
        System.out.println("You have Choosen " +this.burgerName);
        
        while(flag){
            System.out.println("Choose additions: \n (Enter 0 to submit)");
            System.out.println("\n 1 - Cheese \n 2 - Carrots \n 3 - Spinach \n 4 - Mayonnaise");
            if(Main.scan.hasNextInt()){
            switch(Main.scan.nextInt()){
                    case 1:
                        this.message += "Cheese   Ksh. " +super.getAdditions().getCheesePrice()+ "\n";
                        this.totalBurgerPrice += super.getAdditions().getCheesePrice();
                        i++;
                        break;
                    case 2:
                        message += "Carrots   Ksh. " +super.getAdditions().getCarrotsPrice()+ "\n";
                        this.totalBurgerPrice += super.getAdditions().getCarrotsPrice();
                        i++;
                        break;
                    case 3:
                        message += "Spinach   Ksh. " +super.getAdditions().getSpinachPrice()+ "\n";
                        this.totalBurgerPrice += super.getAdditions().getSpinachPrice();
                        i++;
                        break;
                    case 4:
                        message += "Mayonnaise   Ksh. " +super.getAdditions().getMayonnaisePrice()+ "\n";
                        this.totalBurgerPrice += super.getAdditions().getMayonnaisePrice();
                        i++;
                        break;
                    case 0:
                        flag = false;
                        break;
                    default:
                        System.out.println("You have made an invalid choice of additions");
                }
            } 
            if(i == 4)
                flag = false;
        }
        
        System.out.println("Cost of Healthy Burger: Ksh " +healthyBurgerPrice);
        System.out.print(message);
        System.out.println("Total cost: Ksh " +this.totalBurgerPrice);
    } 
    
    public String getLettuce() {
        return lettuce;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public String getTomatoes() {
        return tomatoes;
    }

    public double getTomatoesPrice() {
        return tomatoesPrice;
    }
    
}
