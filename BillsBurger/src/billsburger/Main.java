package billsburger;

import java.util.Scanner;

public class Main {
    
    public static Scanner scan;
    
    public static void main(String[] args) {
        Burger burger = new Burger();
        
        System.out.println("Make an order");
        System.out.println("\n 1 - Standard Burger \n 2 - Healthy Burger \n 3 - Deluxe Burger");
        scan = new Scanner(System.in);
        if(scan.hasNextInt()){
            int choice = scan.nextInt();
            switch(choice) {
                case 1:
                    burger.processOrder();
                    break;
                case 2:
                    burger.getHealthyBurger().processOrder();
                    break;
                case 3:
                    burger.getDeluxeBurger().setDrinkName("Fanta");  //useless statement
                    burger.getDeluxeBurger().processOrder();
                    break;
                default:
                    System.out.println("You have entered an invalid choice");
            }
        }
        scan.close();
    }
    
}
