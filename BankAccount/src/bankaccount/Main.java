package bankaccount;

public class Main {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setBalance(200);
        System.out.println(ba.deposit(500));
        //System.out.println("New balance is Ksh. " +ba.getBalance());
        System.out.println(ba.withdraw(1000));
        System.out.println("New balance is Ksh. " +ba.getBalance());
    }
    
}
