package ChibuzorSnacks.BankApp;

public class BankAccount {
    private String firstName;
    private double balance = 0;

    private  int accountNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public double deposit(double amount){
        validateDeposit(amount);
        balance += amount;
        return balance;
    }
    public double withDraw(double amount){
        validateWithDraw(amount);
        balance -= amount;
        return  balance;
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
        return "BankAccount" +
                "firstName='" + firstName + '\'' +
                " Balance=" + balance +
                "AccountNumber=" + accountNumber +
                "";
    }
}
