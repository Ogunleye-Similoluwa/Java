package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int temp;
        int sum =0;
        for (int i = 0; i <= 5; i++){
            System.out.println("Enter a palindrome");
             int number = in.nextInt();
             temp = number;
             int length = String.valueOf(number).length();

             if (length == 5){
                 for (int n = number; n > 0; n /= 10 ) {
                     int r = n % 10;
                     sum = (sum * 10) + r;

                 }
                 if (temp == sum){
                     System.out.println("This is a palindrome number");
                 }

                 else {
                     System.out.println("This is not a palindrome number");

                 }
                 break;

             }
             else {
                 System.out.println("Enter a valid number");
             }

        }
    }
}
