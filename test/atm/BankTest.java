package atm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Test
    public void testThatICanAddAccount() {
        bank.addCustormer("Onafujabi eniola","pin","08146997803");
        assertEquals(1,bank.checkHowManyCustormerIHave());
    }

    @Test
    public void testThatICanDeposit() {
        bank.addCustormer("Onafujabi Eniola","pin","08146997803");
        assertEquals(1,bank.checkHowManyCustormerIHave());
        bank.deposit("8146997803",1000);
        assertEquals(1000,bank.checkBalance("8146997803","pin"));
    }

    @Test
    public void testThatICanWithdraw() {
        bank.addCustormer("Onafujabi Eniola","pin","08146997803");
        assertEquals(1,bank.checkHowManyCustormerIHave());
        bank.deposit("8146997803",1000);
        assertEquals(1000,bank.checkBalance("8146997803","pin"));
        bank.withdraw("8146997803","pin",500);
        assertEquals(500,bank.checkBalance("8146997803","pin"));
    }

    @Test
    public void testThatICanTransfer() {
        bank.addCustormer("Onafujabi Eniola","pin","08146997803");
        assertEquals(1,bank.checkHowManyCustormerIHave());
        bank.deposit("8146997803",1000);
        assertEquals(1000,bank.checkBalance("8146997803","pin"));
        bank.addCustormer("Oluwafemi janet","pin","0123456789");
        assertEquals(2,bank.checkHowManyCustormerIHave());
        bank.transfer("8146997803","123456789","pin",500);
        assertEquals(500,bank.checkBalance("123456789","pin"));
    }
}