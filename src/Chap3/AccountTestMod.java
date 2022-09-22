package Chap3;

import java.util.Scanner;




public class AccountTestMod{

    public static void main(String [] args){

        Account account1 = new Account("Glory",2000.00 );
        Account account2 = new Account("Aramah",1000.00);

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("enter deposit amount1 for account:");
        double depositAmount1 = input.nextDouble();
        System.out.printf("%nadding:$%.2f to account1balance%n%n", depositAmount1);
        account1.depositAmount(depositAmount1);

        displayAccount(account1);
        displayAccount(account2);


        System.out.print("enter deposit amount for account2:");
        double depositAmount2 = input.nextDouble();
        System.out.printf("%nadding:$%.2f to account2Balance%n%n", depositAmount2);
        account2.depositAmount(depositAmount2);



        displayAccount(account1);
        displayAccount(account2);


        System.out.print("enter amount you want to withdraw:");
        double withdrawAmount = input.nextDouble();
        System.out.printf(" withdrawing :$%.2f amount from account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        displayAccount(account1);
        displayAccount(account2);


    }
    public static void displayAccount(Account henry){
        System.out.printf("%s balance:$%.2f%n%n", henry.getName(), henry.getBalance());

    }



}