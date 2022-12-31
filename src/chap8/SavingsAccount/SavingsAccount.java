package chap8.SavingsAccount;

public class SavingsAccount {
    private AnnualInterestRate   rate  ;
    private double savingsBalance;
        public   SavingsAccount(){
    }

  //  public SavingsAccount(double balance){
    //    savingsBalance = balance;
    //}
    public SavingsAccount(double balance , double rate){
       this.rate = new AnnualInterestRate(rate);
        savingsBalance = balance;
    }
       public double calculateMonthlyInterestRate(double rate){
        this.rate.setRate(rate);
        double monthlyInterestRate = (savingsBalance * this.rate.getRate())/ 12;
        savingsBalance += monthlyInterestRate;
            return Math.floor(savingsBalance);
    }
    public double calculateMonthlyInterestRate(){
        double monthlyInterestRate = (savingsBalance * this.rate.getRate())/ 12;
        savingsBalance += monthlyInterestRate;
        return Math.floor(savingsBalance);
    }


}
