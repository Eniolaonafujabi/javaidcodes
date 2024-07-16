package atm;

public class Account {
    private String pin;
    private double balance;
    private String accountId;
    private String accountName;

    public Account(String accountName, String pin, String accountNumber) {
        this.pin = pin;
        this.accountId = accountNumber;
        this.balance = 0;
        this.accountName = accountName;
    }

    public double checkAccountBalance(String pin) {
        if(checkIfPinIsCorrect(pin)) {
            return balance;
        }
        return 0;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount, String pin) {
        if(checkIfPinIsCorrect(pin)){
            if (amount > 0) {
                if (amount < balance)balance -= amount;
            }
        }
    }

    public String checkAccountId() {
        return accountId;
    }


    private boolean checkIfPinIsCorrect(String pin){
        return pin.equalsIgnoreCase(this.pin);
    }
}
