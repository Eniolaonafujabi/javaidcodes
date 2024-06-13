package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountBalanceTest {
    @Test
    public void testAccountBalanceIsZero() {
        AccountBalance eniola = new AccountBalance();
        double balance = eniola.checkBalance("pin");
        assertEquals(0, balance);
    }
    @Test
    public void testAccountBalanceCanIncrease(){
        AccountBalance eniola = new AccountBalance();
        assertEquals(0, eniola.checkBalance("pin"));
        eniola.deposit(5000);
        assertEquals(5000, eniola.checkBalance("pin"));
    }
    @Test
    public void testYouCan_tDepositNagativeAmount(){
        AccountBalance eniola = new AccountBalance();
        assertEquals(0, eniola.checkBalance("pin"));
        eniola.deposit(3000);
        eniola.deposit(-5000);
        assertEquals(3000, eniola.checkBalance("pin"));
    }

    @Test
    public void testThatICanWithdrawFromMyBalance() {
        AccountBalance eniola = new AccountBalance();
        assertEquals(0,eniola.checkBalance("pin"));
        eniola.deposit(3000);
        assertEquals(3000, eniola.checkBalance("pin"));
        eniola.withdraw(1000);
        assertEquals(2000, eniola.checkBalance("pin"));
    }
    @Test
    public void testThatICanNotWithdrawMoreThanMyBalance() {
        AccountBalance eniola = new AccountBalance();
        assertEquals(0,eniola.checkBalance("pin"));
        eniola.deposit(3000);
        assertEquals(3000, eniola.checkBalance("pin"));
        eniola.withdraw(4000);
        assertEquals(3000, eniola.checkBalance("pin"));
    }
    @Test
    public void testThatICanNotWithdrawNegativeAmountFromMyBalance() {
        AccountBalance eniola = new AccountBalance();
        assertEquals(0,eniola.checkBalance("pin"));
        eniola.deposit(3000);
        assertEquals(3000, eniola.checkBalance("pin"));
        eniola.withdraw(-2000);
        assertEquals(3000, eniola.checkBalance("pin"));
    }
}