package BankAppTest;

import ChibuzorSnacks.BankApp.BankAccount;
import ChibuzorSnacks.BankApp.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    public void userHasABankAccount(){
        User me = new User("Simi","ogunleye",1234);
        assertEquals(120,me.deposit(120));
        assertEquals( 100,me.withDraw(20));
     try {
        me.deposit(-120);
     }
     catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
     }
    }
}
