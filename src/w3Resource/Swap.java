package w3Resource;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int no1 = input.nextInt();
        System.out.println("Enter second number");
        int no2 = input.nextInt();
        System.out.printf("Before swapping %d and %d", no1,no2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.printf("After swapping %d and %d", no2,no1);
    }
}
