package atm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account account;
    @BeforeEach
    public void setUp() {
        account = new Account("Onafujabi eniola","pin","1");
    }

    @Test
    public void testAccountBalanceIsZero() {
        assertEquals(0,account.checkAccountBalance("pin"));
    }

    @Test
    public void testAccountBalanceCanBeIncreased() {
        assertEquals(0,account.checkAccountBalance("pin"));
        account.deposit(200);
        assertEquals(200,account.checkAccountBalance("pin"));
    }

    @Test
    public void testThatICanWithdraw() {
        assertEquals(0,account.checkAccountBalance("pin"));
        account.deposit(200);
        assertEquals(200,account.checkAccountBalance("pin"));
        account.withdraw(100,"pin");
        assertEquals(100,account.checkAccountBalance("pin"));
    }

    @Test
    public void testThatICanWithdrawNegative() {
        assertEquals(0,account.checkAccountBalance("pin"));
        account.deposit(200);
        assertEquals(200,account.checkAccountBalance("pin"));
        account.withdraw(-100,"pin");
        assertEquals(200,account.checkAccountBalance("pin"));
    }

    @Test
    public void testThatICan_tWithdrawMoreThanBalance() {
        assertEquals(0,account.checkAccountBalance("pin"));
        account.deposit(200);
        assertEquals(200,account.checkAccountBalance("pin"));
        account.withdraw(300,"pin");
        assertEquals(200,account.checkAccountBalance("pin"));
    }

    @Test
    public void testThatICan_tDepositNegativeAmount(){
        assertEquals(0,account.checkAccountBalance("pin"));
        account.deposit(-500);
        assertEquals(0,account.checkAccountBalance("pin"));
    }

    @Test
    public void testThatICan_tCheckBalanceWithWrongPin(){
        assertEquals(0,account.checkAccountBalance("pin"));
        account.deposit(200);
        assertEquals(0,account.checkAccountBalance("pinnn"));
    }

    @Test
    public void testThatICan_tWithdrawWithWrongPin(){
        assertEquals(0,account.checkAccountBalance("pin"));
        account.deposit(200);
        assertEquals(200,account.checkAccountBalance("pin"));
        account.withdraw(100,"pinn");
        assertEquals(200,account.checkAccountBalance("pin"));
    }
}