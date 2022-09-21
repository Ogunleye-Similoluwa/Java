package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class ThreeInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter first number");
        int number1 = in.nextInt();
        System.out.println("Enter second number");
        int number2 = in.nextInt();
        System.out.println("Enter first number");
        int number3 = in.nextInt();
        if (number1 == number2 && number1== number3 ){
            System.out.println("All are equal");
        }
        if (number1 != number2 && number1 != number3 || number2 != number1 && number2 != number3 ){
            System.out.println("All are different");
        }
        else{
            System.out.println("Neither all are same or different");
        }

    }
}
