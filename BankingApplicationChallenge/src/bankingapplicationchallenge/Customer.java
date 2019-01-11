package bankingapplicationchallenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double> txns = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, Double depositAmount) {
        this.name = name;
        txns.add(0, depositAmount);
    }  

    public void addTxn(Double amount){
        txns.add(amount);
    }
    
    public String getName() {
        return name;
    }

}
