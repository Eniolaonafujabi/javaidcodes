package tdd;

public class AccountBalance {

    private double balance;

    public double checkBalance(String pin) {
    return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount < this.balance && amount > 0) {
            this.balance -= amount;
        }
    }
}
