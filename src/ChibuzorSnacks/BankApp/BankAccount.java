package ChibuzorSnacks.BankApp;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance ;

    private  int accountNumber;
    private User user;
    public BankAccount(String firstName, String lastName, int  accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }


    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        validateDeposit(amount);
        balance += amount;

    }
    public void withDraw(double amount){
        validateWithDraw(amount);
        balance -= amount;

    }
    private void  validateWithDraw(double amount){
        if(amount > balance){
            throw new IllegalArgumentException("Amount to be withDrawed should be greater than balance ");
        }
    }
    private void validateDeposit(double amount){
        if(amount < 0.0){
            throw new IllegalArgumentException("Deposit amount must be greater than 0");
        }

    }


    @Override
    public String toString() {
        return String.format("""
                FirstName-%s
                Balance-%f
                AccountNumber-%d
                """,firstName,balance,accountNumber);
    }
}
