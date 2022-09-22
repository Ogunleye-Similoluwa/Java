package tdd;

public class Account {
    private int balance;


    public void deposit(int amount) {
        if(amount > 0)
         balance = balance + amount;
         this.balance = balance;
    }

    public int getBalance() {

        return balance;
    }

    public void withdraw(int cash) {
        if (cash <= balance) {
            balance = balance - cash;
        }



    }
}





