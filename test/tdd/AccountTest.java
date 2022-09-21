package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void depositMoney() {

        Account amirahTeensAccount = new Account();

        amirahTeensAccount.deposit(3000);
         amirahTeensAccount.getBalance();
        assertEquals(3000, amirahTeensAccount.getBalance());
    }

    @Test
    public void withdraw() {
        Account amirahTeensAccount = new Account();
        amirahTeensAccount.deposit(3000);
        amirahTeensAccount.getBalance();
        assertEquals(3000, amirahTeensAccount.getBalance());
        amirahTeensAccount.withdraw(2000);
        assertEquals(1000, amirahTeensAccount.getBalance());

    }





}
