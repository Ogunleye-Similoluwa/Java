package chap4;
/*4.20 (Tax Calculator) Develop a Java application that determines the total tax for each of three
citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
a given year. Your program should input this information for each citizen,
 then determine and display the citizen’s total tax. Use class Scanner to input the data.
 */

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {


//        double taxRate1= 0.15;
//        double taxRate2 = 0.20;
//        double total =0;
//        double sum =0;
        citizen_sTotalTax();


    }

    public static void citizen_sTotalTax(){
        Scanner in = new Scanner(System.in);

        double taxRate1= 0.15;
       double taxRate2 = 0.20;
        double total =0;
        double sum =0;


        for (int count =1 ; count <=3; count++){
            System.out.println("Enter name");
            String name = in.next();
            System.out.println("Enter amount earned");
            double amount = in.nextDouble();
            if (amount <= 30000){
                total =  (taxRate1 * amount);
            } else if (amount > 30000) {
                total = taxRate2 * amount;

            }
            sum += total;
            System.out.printf("""
                    The name of the customer are : %s
                    The Amount for the %s is :%.2f
                    
                    """,name,name,total);
        }
        System.out.printf("The total of all tax is : %.2f",  sum);

    }

}
