package chap4;
/*4.21 (Find the Largest Number) The process of finding the largest value is used frequently in computer applications.
 For example, a program that determines the winner of a sales contest would input
        the number of units sold by each salesperson. The salesperson who sells the most units wins the contest.
        Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines and
        prints the largest integer. Your program should use at least the following three variables:
        a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
        input and to determine when all 10 numbers have been processed).
        b) number: The integer most recently input by the user.
        c) largest: The largest number found so far.Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number = in.nextInt();
        int count =1;
        int largestNo = number;
        int second = number;
        while (count <= 10) {
            System.out.println("Enter number");
            number = in.nextInt();
            if (number > largestNo) {
                second = number;
                largestNo = number;

                count++ ;
            }

        }
        System.out.println("The largest number is :" + largestNo + " " + second);



*/


import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("Enter the first number: ");
                int number = input.nextInt();

                int largest2 = number;
                int largest = number;

                for (int i = 1; i <= 9; i++) {
                    System.out.println("Enter the number: ");
                    number = input.nextInt();
                    if (number > largest) {
                        largest2 = largest;
                        largest = number;
                    }
                }

                System.out.printf("The largest number is %d%n", largest);
                System.out.printf("The second largest number is %d", largest2);



    }
}