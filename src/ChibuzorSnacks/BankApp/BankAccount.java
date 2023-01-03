package ChibuzorSnacks.BankApp;

public class BankAccount {
    private final String firstName;
    private final String lastName;
    private double balance ;

    private final int accountNumber;
    public BankAccount(String firstName, String lastName, int  accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }


    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) throws Exception {
        validateDeposit(amount);
        balance += amount;
    }
    public void withDraw(double amount) throws Exception {
        validateWithDraw(amount);
        balance -= amount;
    }
    private void  validateWithDraw(double amount) throws Exception {
        if(amount > balance){
            throw new Exception("Amount to be withDrawed should be greater than balance ");
        }
    }
    private void validateDeposit(double amount) throws Exception {
        if (amount < 0.0) {
            throw new Exception("Deposit amount must be greater than 0");
        }
    }
    @Override
    public String toString() {
        return String.format("""
                Name - %s-%s
                Balance - %.3f
                AccountNumber - %d
                """, firstName,lastName,getBalance(),accountNumber);
    }
}
