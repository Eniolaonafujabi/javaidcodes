package atm;

import java.util.ArrayList;

public class Bank {
    private  ArrayList<Account> accounts = new ArrayList<>();
    private Account account;
    private int noOfCustomers;

    public void addCustormer(String accountName, String pin,String phoneNumber){
        account = new Account(accountName,pin,generateAccountNumber(phoneNumber));
        accounts.add(account);
        noOfCustomers++;
    }


    public int checkHowManyCustormerIHave() {
        return noOfCustomers;
    }

    public void deposit(String accountNo, double amount){
        Account account = findAccount(accountNo);
        account.deposit(amount);
    }
    public void withdraw(String acountNo, String pin, double amount) {
        Account account = findAccount(acountNo);
        account.withdraw(amount,pin);
    }

    public double checkBalance(String accountNo,String pin){
        Account account = findAccount(accountNo);
        return account.checkAccountBalance(pin);
    }

    private Account findAccount(String accountNo) {
        for (Account account : accounts) {
            if (account.checkAccountId().equals(accountNo)) {
                return account;
            }
        }
        return null;
    }

    private String generateAccountNumber(String phoneNumber) {
        return phoneNumber.substring(1);
    }


    public void transfer(String senderAccountNumber, String receiverAccountNumber, String pin, double amount) {
        Account sender = findAccount(senderAccountNumber);
        Account receiver = findAccount(receiverAccountNumber);
        sender.withdraw(amount,pin);
        receiver.deposit(amount);
    }
}
