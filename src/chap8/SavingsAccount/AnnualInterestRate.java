package chap8.SavingsAccount;

public class AnnualInterestRate {
    private  double rate;

    public  AnnualInterestRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {

        return rate / 100;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
