package ChibuzorSnacks.BankApp;

public class User {
    private   String firstName;
    private String lastName;
    private BankAccount account;

    private final int accountNumber;
    public User(String fName, String lName, int accountNumber){
        account= new BankAccount();
        firstName = fName;
        lastName = lName;
        this.accountNumber = accountNumber;
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
    public double deposit(double amount){
        account.deposit(amount);
        return account.getBalance();
    }
    public double withDraw(double amount){
       account.withDraw(amount);
        return  account.getBalance();
    }

    public BankAccount findAccount(int accountNumber) {

        if (accountNumber == account.getAccountNumber() ) {
            return account;
        }
        else{
            String.format("Account does not exist");
        }
        return null;
    }
}
