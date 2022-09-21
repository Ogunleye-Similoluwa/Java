package chap4;
/* (Credit Limit Calculator) Develop a Java application that determines whether
any of several department-store customers has exceeded the credit limit on a charge account.
For each customer, the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.

The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded,
 the program should display the message "Credit limit exceeded".
 */

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" enter account number");
        int account = input.nextInt();
        System.out.println("Enter initial balance");
        int initialBalance = input.nextInt();

            int item = 1;
            int total = 0;
            ;
            while (item != -1){
                System.out.println("enter amount  of item purchased");
                 item =input.nextInt();
                total += item;
            }
        System.out.println("The total of all the item purchased is : " + total);
            int credit =1;
            int sum = 1;
            int charges = 10;
        while (credit != -1){
                    System.out.println("Enter credit amount");
                    sum = initialBalance + charges - credit;
            credit = input.nextInt();
                    if ( sum > 10_000_000) {
                        System.out.println("credit limit exceeded");
                        break;
                    }
        }
        System.out.println("The new balance is = " + sum);

    }
}
