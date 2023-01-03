package BankAppTest;

import ChibuzorSnacks.BankApp.BankAccount;
import ChibuzorSnacks.BankApp.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    public void userHasABankAccount() throws Exception {
        User me = new User("Simi","ogunleye",1234);
        me.deposit(120);
        assertEquals(120,me.getBalance());
        me.withDraw(20);
        assertEquals( 100,me.getBalance());
     try {
        me.deposit(-120);
     }
     catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
     }


    }
}
