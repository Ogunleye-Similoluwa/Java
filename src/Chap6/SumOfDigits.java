package Chap6;
/*(Calculating the Sum of Digits) Write a method that takes a four-digit integer value and
returns the sum of the digits. For example, given the number 7631, the method should return 17.
Incorporate the method into an application that reads a value from the user and displays the result*/

public class SumOfDigits {
    public static int sumOfDigits(int value) {
        int rem ;
        int total = 0;
        for (int i = 0; i <= value ; i++) {
            rem = value % 10;
            total += rem;
            value /= 10;

        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("The sum of the digits is :" + sumOfDigits(7613));
    }
}
