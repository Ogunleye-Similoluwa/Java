package ChibuzorAssignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();

        int no ;
        int factorial = 1;
        for (no = 1; no <= number; no++){
            factorial = factorial * no;

        }
        System.out.printf("The factorial of %d is :%d",number , factorial);
    }
}
