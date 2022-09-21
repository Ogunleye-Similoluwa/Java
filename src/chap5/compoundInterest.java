package chap5;

public class compoundInterest {

    public static void main(String[] args) {

        double principal = 1000;
        double rate = 0.05;

        int years= 1;
        double amount=0;
        System.out.printf("%s%20s%n", "years" , "Amount on deposit");

        while (years <= 10){
            amount = principal * Math.pow(1 + rate,years);
            System.out.printf("%d%20.2f%n",years,amount);
            years++;
        }
    }
}
