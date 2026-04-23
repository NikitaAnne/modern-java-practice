package encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(1500.75);

        System.out.println("Current Bank Balance: Rs." + account.getBalance());
    }
}

class BankAccount {
    private double balance;

    //Setter method
    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }

    //Getter method
    public double getBalance() {
        return this.balance;
    }

}

