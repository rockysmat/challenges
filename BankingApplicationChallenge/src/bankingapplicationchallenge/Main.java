package bankingapplicationchallenge;

import java.util.Scanner;

public class Main {
    
        private static Bank bank = new Bank();
        
    public static void main(String[] args) {
        
        printMenu();
        banking();
        
    }
    
    public static void printMenu(){
        System.out.println("Menu: \n" +
                "0 - Exit \n" +
                "1 - Add Branch \n" +
                "2 - Register Customer \n" +
                "3 - Add Customer Transaction \n" +
                "4 - List All Branches \n" +
                "5 - List All Customers of a Branch \n" +
                "6 - Print Menu");
    }
    
    public static void banking(){
       Scanner scan = new Scanner(System.in);
       boolean flag = true;
       while(flag){
           System.out.print("Enter an option: \n(6 - Shows available options): ");
           if(scan.hasNextInt()){
                int choice = scan.nextInt();
                switch(choice){
                    case 0: 
                        flag = false;
                        System.out.println("Goodbye");
                        break;
                    case 1:
                        scan.nextLine();
                        System.out.print("Enter branch name: ");
                        String braName = scan.nextLine();
                        bank.createBranch(braName);
                        break;
                    case 2:
                        scan.nextLine();
                        System.out.print("Enter existing branch name: ");
                        String branchName = scan.nextLine();
                        System.out.print("Enter customer name: ");
                        String customerName = scan.nextLine();
                        System.out.print("Enter initial deposit amount: ");
                        Double depositAmount = scan.nextDouble();
                        scan.nextLine();
                        bank.regCustomer(branchName, customerName, depositAmount);
                        break;
                    case 3:
                        scan.nextLine();
                        System.out.print("Enter branch name: ");
                        String branName = scan.nextLine();
                        System.out.print("Enter customer name: ");
                        String custName = scan.nextLine();
                        System.out.print("Enter deposit amount: ");
                        Double depoAmount = scan.nextDouble();
                        scan.nextLine();
                        bank.addTxn(branName, custName, depoAmount);
                        break;
                    case 4:
                        scan.nextLine();
                        bank.listAllBranches();
                        break;
                    case 5:
                        scan.nextLine();
                        System.out.print("Enter existing branch name: ");
                        String bName = scan.nextLine();
                        bank.listAllCustomers(bName);
                        break;
                    case 6:
                        printMenu();
                        break;
                    default:
                        System.out.println("You have not entered a valid option");      
                }
           }
           else{
                System.out.println("Please enter a valid menu choice");
                scan.nextLine();
           }
       }
       scan.close();
    }
    
}
