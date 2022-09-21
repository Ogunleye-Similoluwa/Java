package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers");
        int number;
        int sum = 0;
        int count = 0;

        for (count = 1; count <= 5; count++) {
            sum += count;
            number = input.nextInt();


            System.out.println(sum);

            double average = 0;
            if (count != 0) {
                average = (double) sum / count;
            }
            System.out.println("The average of the numbers are " + average);
        }

    }
}