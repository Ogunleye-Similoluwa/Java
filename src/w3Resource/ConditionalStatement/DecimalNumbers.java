package w3Resource.ConditionalStatement;
/*Write a Java program that reads a floating-point number.
        If the number is zero it prints"zero", otherwise,print "positive" or "negative".
        Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.*/

import java.util.Scanner;

public class DecimalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        double num = in.nextInt();
        if (num > 0){
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else if (num == 0) {
            System.out.println("Zero");

        } else if (Math.absExact((int)num) < 1) {
            System.out.println("small");
        } else if (Math.absExact((int)num) > 1_000_000) {
            System.out.println("Large");

        }
    }
}
