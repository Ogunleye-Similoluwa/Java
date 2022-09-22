package chap5;

public class ModCompoundInterest {
    public static void main(String[] args) {
        double principal = 1000;
        double amount ;
            for (double rate = 0.05; rate <= 0.10; rate += 0.01){
                System.out.println();
                System.out.println();
                System.out.printf("%s  %20s%n", "years", "  rate Amount on deposit");
                for (int years = 1 ; years <= 10 ; years++) {

                    amount = principal * Math.pow(1 + rate, years);

                    System.out.printf("%d%20.2f%n", years, amount);

                }

            }
        }

    }




