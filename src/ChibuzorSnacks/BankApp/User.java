package ChibuzorSnacks.BankApp;

public class User {
    private String firstName;
    private String lastName;
    private double balance;
    private BankAccount account;

    private final int accountNumber;

    public User(String fName, String lName, int accountNumber) {
        firstName = fName;
        lastName = lName;
        this.accountNumber = accountNumber;
        account = new BankAccount(fName, lName, accountNumber);
        this.balance = account.getBalance();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double deposit(double amount) {
        account.deposit(amount);
        return balance;
    }

    public double withDraw(double amount) {
        account.withDraw(amount);
        return balance;
    }

    public BankAccount findAccount(int accountNumber) {

        if (accountNumber == this.getAccountNumber()) {
            return account;
        } else {
            System.out.println("Account does not exist");
        }
        return null;
    }
}
