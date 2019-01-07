package billsburger;

public class DeluxeBurger extends Burger {
    private String drinkName;
    private String chipsName;
    private double deluxBurgerPrice;

    public DeluxeBurger() {
        //super();
        this.drinkName = "Coke";
        this.chipsName = "French Fries";
        this.deluxBurgerPrice = 400;
    }
    
    @Override
    public void processOrder(){
        super.setBurgerName("Deluxe Burger");
        System.out.println("You have ordered: " +super.getBurgerName()+ " which has " +getDrinkName()+ " and " +getChipsName());
        System.out.println("Total Price Ksh. " +this.deluxBurgerPrice);
    }   

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getChipsName() {
        return chipsName;
    }
    
}
    