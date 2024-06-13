package tdd;

import java.util.Scanner;

public class AtmMachine {
    private static Bank gtBank = new Bank();
    public static void main(String[] args) {
        goToMainMenu();
    }

    private static void goToMainMenu() {
        String bankMenu = """
                Welcome to the GtBank ATM Machine.
                1 -> Create a new Account.
                2 -> Deposit from account.
                3 -> Withdraw from account.
                4 -> Transfer from account.
                5 -> Display account balance.
                6 -> Exit.
                """;
        char inputForMainMenu = input(bankMenu).charAt(0);
        switch (inputForMainMenu) {
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> transfer();
            case '5' -> checkBalance();
            case '6' -> exitMethod();
            default -> goToMainMenu();
        }
    }

    private static void exitMethod() {
        System.exit(69);
    }

    private static void checkBalance() {
        String accountNumber = input("Enter account number: ");
        String pin = input("Enter pin: ");
        output(String.valueOf(gtBank.checkBalance(accountNumber, pin)));
        goToMainMenu();
    }

    private static void transfer() {
        String senderAccountNo = input("Enter account no: ");
        String receiverAccountNo = input("Enter receiver account no: ");
        String pin = input("Enter pin: ");
        double amount = Double.parseDouble(input("Enter amount: "));
        gtBank.transfer(senderAccountNo, receiverAccountNo, pin, amount);
        goToMainMenu();
    }

    private static void withdraw() {
        String accountNumber = input("Enter account number: ");
        String password = input("Enter password: ");
        double amount = Double.parseDouble(input("Enter amount to withdraw: "));
        gtBank.withdraw(accountNumber,password,amount);
        goToMainMenu();
    }

    private static void deposit() {
        String accountNo = input("Enter account number: ");
        double amount = Double.parseDouble(input("Enter amount to deposit: "));
        gtBank.deposit(accountNo, amount);
        goToMainMenu();
    }

    private static void createAccount() {
        String name = input("Enter your name: ");
        String password = input("Enter your password: ");
        String phoneNumber = input("Enter your phone number: ");
        gtBank.addCustormer(name, password, phoneNumber);
        goToMainMenu();
    }

    private static String input(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    private static void output(String prompt){
        System.out.println(prompt);
    }
}
