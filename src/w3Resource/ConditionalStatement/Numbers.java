package w3Resource.ConditionalStatement;
/* Write a Java program that reads an integer and check whether it is negative, zero, or positive.*/

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int num = in.nextInt();
        if (num > 0){
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else if (num == 0) {
            System.out.println("Zero");

        }
    }
}
