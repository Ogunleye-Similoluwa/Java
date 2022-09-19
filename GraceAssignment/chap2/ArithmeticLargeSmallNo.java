package chap2;
/*(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
        user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
        shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
        representation of the average. So, if the sum of the values is 7, the average should be 2, not
        2.3333….*/

import java.util.Scanner;

public class ArithmeticLargeSmallNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter first number");
        int number1 = in.nextInt();
        System.out.println("Enter second number");
        int number2 = in.nextInt();
        System.out.println("Enter first number");
        int number3 = in.nextInt();

        int sum = number1 + number2 + number3;
        int average = (number1 + number2 + number3) /  3 ;
        int product = number1 * number2 * number3;
        System.out.printf("""
                The sum of the numbers are: %d
                The average of the numbers are : %d
                The product of the numbers are : %d
                """,sum,average,product);

      if (number1> number2 && number1 > number3) {
            System.out.println("The largest number is :" + number1);
        }
        if (number2> number1 && number2 > number3) {
            System.out.println("The largest number is :" + number2);
        }
        if (number3> number2 && number3 > number1) {
            System.out.println("The largest number is :" + number3);
        }
        if (number1< number2 && number1 < number3) {
            System.out.println("The Smallest number is :" + number1);
        }
        if (number2< number1 && number2 < number3) {
            System.out.println("The Smallest number is :" + number2);
        }
        if (number3< number2 && number3 < number1) {
            System.out.println("The Smallest number is :" + number3);
        }
    }
}
