package billsburger;

class Additions {
    private String cheese;
    private final double cheesePrice = 60.00;
    private String carrots;
    private final double carrotsPrice = 20.00;
    private String spinach;
    private final double spinachPrice = 15.00;
    private String mayonnaise;
    private final double mayonnaisePrice = 5.00;

    public double getCheesePrice() {
        return cheesePrice;
    }

    public double getCarrotsPrice() {
        return carrotsPrice;
    }

    public double getSpinachPrice() {
        return spinachPrice;
    }

    public double getMayonnaisePrice() {
        return mayonnaisePrice;
    }
    
    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getCarrots() {
        return carrots;
    }

    public void setCarrots(String carrots) {
        this.carrots = carrots;
    }

    public String getSpinach() {
        return spinach;
    }

    public void setSpinach(String spinach) {
        this.spinach = spinach;
    }

    public String getMayonnaise() {
        return mayonnaise;
    }

    public void setMayonnaise(String mayonnaise) {
        this.mayonnaise = mayonnaise;
    }
    
    
}
