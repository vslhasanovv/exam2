public class BankAccount {

    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " " + "Current balance is: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance" + " " + "Available Balance: " + balance);
        }
        else if (amount < balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " " + "Current balance is: " + balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
}

