package chap2.GraceAssignment;

import java.util.Scanner;

public class AccountTest{
 public static void main(String[] args){
Account balance = new Account("simi",5000);
 Scanner input = new Scanner(System.in);

System.out.print("enter amount you want to withdraw");
   double AmountWithDrawed = input.nextDouble();
     System.out.printf("The amount withdraw is %.2f", AmountWithDrawed);
     balance.withdrawMoney(AmountWithDrawed);
}

}




