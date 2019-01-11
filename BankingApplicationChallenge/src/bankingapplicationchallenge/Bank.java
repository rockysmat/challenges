package bankingapplicationchallenge;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
    String name;
    ArrayList<Branch> branches;
    
    public Bank(){
        branches = new ArrayList<>();
    }
    
    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }
    
    public boolean createBranch(String name){
        Branch bran = new Branch(name);
        Iterator<Branch> itr = branches.iterator();
        if(!branches.isEmpty()){
            while(itr.hasNext()){
                if(!itr.next().getName().equalsIgnoreCase(name)){
                    branches.add(bran);
                    System.out.println("Branch created successfully");
                    return true;
                }
                else {
                    System.out.println("Branch already exist");
                    return false;
                }
            }
        }
        branches.add(bran);
        System.out.println("Branch created successfully");
        return true;
    }
    
    public boolean regCustomer(String branchName, String custName, Double initialAmount){
        Iterator<Branch> itr = branches.iterator();
        if (!branches.isEmpty()) {
            while (itr.hasNext()) {
                if (itr.next().getName().equalsIgnoreCase(branchName)) {
                    Branch bran = new Branch(branchName);
                    bran.regCustomer(custName, initialAmount);
                    return true;
                }
                System.out.println("Branch does not exist. Customer not registered");
            }
        }
        else
            System.out.println("Branch does not exist. Customer not registered");
        return false;
    }
    
    public boolean addTxn(String branchName, String custName, Double initialAmount){
        Iterator<Branch> braItr = branches.iterator();
        if (!branches.isEmpty()) {
            while (braItr.hasNext()) {
                if (braItr.next().getName().equalsIgnoreCase(branchName)) {
                    Branch bran = new Branch(branchName);
                    bran.addTxn(custName, initialAmount);
                    return true;
                } else {
                    System.out.println("Branch does not exist. Transaction not recorded");
                }
            }
        }
        else
            System.out.println("Bank has no branches to add a customer");
        return false;
    }   
    
    public void listAllCustomers(String branchName){
        Iterator<Branch> braItr = branches.iterator();
        if(!branches.isEmpty()){
            while(braItr.hasNext()){
                if(braItr.next().getName().equalsIgnoreCase(branchName)){
                    Branch bran = new Branch(branchName);
                    bran.listAllCustomers();
                }
            }
        }   
        else
            System.out.println("Bank has no branches");
    }
    
    public void listAllBranches(){
        Iterator<Branch> braItr = branches.iterator();
        if(!branches.isEmpty()){
            while(braItr.hasNext()){
                System.out.println(braItr.next().getName());
            }
        }
        else
            System.out.println("The bank has no branches");
    }
       
}
