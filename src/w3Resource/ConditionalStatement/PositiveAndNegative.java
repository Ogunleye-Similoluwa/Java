package w3Resource.ConditionalStatement;
//Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
// Otherwise, print "positive" or "negative".
// Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000

import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        double number = in.nextDouble();

        if (number == 0){
            System.out.println("zero");
            System.out.println("positive");
        }
        else if(number < 0) {
            System.out.println("Small");
        } else if (number > 1_000_000) {
            System.out.println("Large");

        }
    }
}
