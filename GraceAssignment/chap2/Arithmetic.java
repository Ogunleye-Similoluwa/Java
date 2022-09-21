package chap2;
/*(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
        the user and prints the square of each, the sum of their squares, and the difference of the squares (first
        number squared minus the second number squared). Use the techniques shown in Fig. 2.7.

import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter first number");
        int number = in.nextInt();
        System.out.println("Enter second number");
        int second = in.nextInt();



        int squareNumber= number * number;
        int squareSecond= second * second;
        int sumOfSquares = (number * number) + (second * second);
        int DifferenceOfSquares = (number * number) - (second * second);


        System.out.printf("%s%d%n%s%d%n%s%d%n%s%d%n","The square of the first number is :",squareNumber,
                            "The square of the the second number is :",squareSecond,
                            "The sum of the squares are :",sumOfSquares,
                                "The difference of the squares is :",DifferenceOfSquares);

    }
} */

