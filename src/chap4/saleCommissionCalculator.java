package chap4;
/*(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
sold for last week and calculates and displays that salesperson’s earnings.
 There’s no limit to the number of items that can be sold.

Item Value
1 239.99
2 129.75
3 99.95
4 350.8 */

import java.util.Scanner;

public class saleCommissionCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double item = 0;
        int counter = 0;
        int commission = 200;
        double total = 0;


        while (item !=-1){
            System.out.println("\nEnter amount of item sold");
             item = in.nextDouble();
             if (item == -1){
                 break;
             }
            total =( 0.09 * item) + commission;
            counter++;
            System.out.printf("%n%s%15s "," salesPerson"," earning");
            System.out.printf("%n%d               $%.2f",counter,total);
        }


    }
}
