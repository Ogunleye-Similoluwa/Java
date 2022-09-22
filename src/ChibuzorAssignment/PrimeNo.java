package ChibuzorAssignment;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = input.nextInt();

        int count;
        for (count = 1; count % 2 == 0; count++) {

        }
        if (number / count  == 1) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }


    }
}
