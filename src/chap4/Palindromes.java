package chap4;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        int sum = 0;
        int temp;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a  number: ");
            int number = in.nextInt();
            temp = number;
            int length = String.valueOf(number).length();

            if (length == 5) {
                for (int n = number; n > 0; n /= 10) {
                    int r = n % 10;
                    sum = (sum * 10) + r;
                }
                if (temp == sum) {
                    System.out.println("The number is a palindrome.");
                } else {
                    System.out.println("The number is not a palindrome.");
                }
                break;
            } else System.out.println("Enter a valid number!");
        }
    }
}
