package w3Resource.ConditionalStatement;
 /*Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor

         Test Data
         Input number: 35
         Expected Output :
         Number is positive*/

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number");
        int number = in.nextInt();

        if (number > 0){
            System.out.println("The number is Positive");
        }
        else {
            System.out.println("The number is Negative");
        }

    }
}
