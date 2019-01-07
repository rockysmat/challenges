package billsburger;

import java.util.Scanner;

public class Burger {
    private String breadRollType;
    private boolean meat;
    private double burgerPrice;
    private double totalBurgerPrice;
    private String burgerName = "Standard Burger";
    private String message = "";
    private Additions additions;
    private HealthyBurger healthyBurger;
    private DeluxeBurger deluxeBurger;
    
    public Burger() {
        this.breadRollType = "Brown rye bread roll";
        this.meat = true;
        this.burgerPrice = 200;
        this.totalBurgerPrice = burgerPrice;
        this.additions = new Additions();
    }
    
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
                        message += "Cheese   Ksh. " +additions.getCheesePrice()+ "\n";
                        totalBurgerPrice += additions.getCheesePrice();
                        i++;
                        break;
                    case 2:
                        message += "Carrots   Ksh. " +additions.getCarrotsPrice()+ "\n";
                        totalBurgerPrice += additions.getCarrotsPrice();
                        i++;
                        break;
                    case 3:
                        message += "Spinach   Ksh. " +additions.getSpinachPrice()+ "\n";
                        totalBurgerPrice += additions.getSpinachPrice();
                        i++;
                        break;
                    case 4:
                        message += "Mayonnaise   Ksh. " +additions.getMayonnaisePrice()+ "\n";
                        totalBurgerPrice += additions.getSpinachPrice();
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
        
        System.out.println("Cost of Standard Burger: Ksh " +getBurgerPrice());
        System.out.print(message);
        System.out.println("Total cost: Ksh " +totalBurgerPrice);
    } 
    
    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public HealthyBurger getHealthyBurger() {
        healthyBurger = new HealthyBurger("Lettuce", "Tomatoes");
        return healthyBurger;
    }

    public DeluxeBurger getDeluxeBurger() {
        deluxeBurger = new DeluxeBurger();
        return deluxeBurger;
    }

    public double getTotalBurgerPrice() {
        return totalBurgerPrice;
    }

    public String getMessage() {
        return message;
    }

    public Additions getAdditions() {
        return additions;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
