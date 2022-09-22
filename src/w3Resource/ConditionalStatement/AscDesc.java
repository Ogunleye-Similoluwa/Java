package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class AscDesc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter first number");
        int number1 = in.nextInt();
        System.out.println("Enter second number");
        int number2 = in.nextInt();
        System.out.println("Enter first number");
        int number3 = in.nextInt();
        if (number1 < number2 && number2 < number3) {
            System.out.println("Increasing");
        }
       else if (number1 > number2 && number2 > number3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing");
        }
    }
}
