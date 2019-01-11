package bankingapplicationchallenge;

import java.util.ArrayList;
import java.util.Iterator;

public class Branch {
    private String name;
    ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }
    
    public boolean regCustomer(String name, Double initialAmount){
        Customer cust = new Customer(name, initialAmount);
        Iterator<Customer> itr = customers.iterator();
        if(!customers.isEmpty()){
            while(itr.hasNext()){
                if(!itr.next().getName().equalsIgnoreCase(name)){
                    customers.add(cust);
                    System.out.println("Customer registered successfully");
                }
                else{
                    System.out.println("Customer already exist");
                    return false;
                }
            }
        }
        else{
            customers.add(cust);
            System.out.println("Customer registered successfully");
        }
        return true;
    }
    
    public boolean addTxn(String name, Double amount){
        Customer cust = new Customer(name);
        Iterator<Customer> itr = customers.iterator();
        if (!customers.isEmpty()) {
            while (itr.hasNext()) {
                if (itr.next().getName().equalsIgnoreCase(name)) {
                    cust.addTxn(amount);
                    System.out.println("Customer transaction recorded successfully");
                    return true;
                } else {
                    System.out.println("Customer doesn't exist");
                }
            }
        }
        else
            System.out.println("Branch has no customers to record transactions");
        return false;
    }

    public void listAllCustomers(){
        Iterator<Customer> itr = customers.iterator();
        if(!customers.isEmpty()){
            while(itr.hasNext())
                System.out.println(itr.next().getName());
        }
        else
            System.out.println("The branch has no customers");
    }
    
    public String getName() {
        return name;
    }

}
