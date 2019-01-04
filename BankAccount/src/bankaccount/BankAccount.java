package bankaccount;

public class BankAccount {
    private int accountNumber;
    private int balance = 0;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;
    
    public String deposit(int amount){
        balance += amount;
        return "Deposit successful";
    }
    
    public String withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
            return "Withdrawal successful";
        }
        else 
            return "Not enough money to withdraw";
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
