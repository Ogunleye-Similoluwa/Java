package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class NTerms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number = in.nextInt();

        int count;
        int sum =0;
        for (count = 1; count <= number; count++) {
            sum = sum + count;
            System.out.println("The first natural numbers " + count);
        }

        System.out.println("The sum of the numbers are  " + sum);
    }
}
