package chap8Test;


import chap8.SavingsAccount.AnnualInterestRate;
import chap8.SavingsAccount.SavingsAccount;
import org.junit.jupiter.api.Test;
/*
(Savings Account Class) Create class SavingsAccount./
Use a static variable annualInterestRate to store the annual interest rate for all account holders.
 Each object of the class contains a
private instance variable savingsBalance indicating the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest to calculate the monthly interest in multiplying the
savingsBalance by annualInterestRate divided by 12—this interest should be added to savingsBalance.
Provide a static method modifyInterestRate that sets the annualInterestRate to a new
value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2,
with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to
4%, then calculate the monthly interest for each of 12 months and print the new balances for both
savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print the
new balances for both savers.
 */

import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {

    @Test
    public void setUp(){
        SavingsAccount account = new SavingsAccount();
        assertNotNull(account);
    }
    @Test
    public void savingsAccountHasAnnualInterestRate(){


        SavingsAccount account = new SavingsAccount(2000,5);
        SavingsAccount account1 = new SavingsAccount(3000,5);


        assertEquals(2008.0,account.calculateMonthlyInterestRate(5));
        assertEquals(3012.0,account1.calculateMonthlyInterestRate());

    }

}
