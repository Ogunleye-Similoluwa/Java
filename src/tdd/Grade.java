package tdd;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failure = 0;
        int studentCounter = 1;
        while (studentCounter <= 10) {
            System.out.println("Enter grade");
            int result = input.nextInt();

            if (result == 1) {
                passes = passes + 1;
            } else {
                failure = failure + 1;
            }
            studentCounter++;
        }
            System.out.println("passes:" + passes);
            System.out.println("failures:" + failure);

        if (passes > 8){
            System.out.println("Bonus to instructor");

        }
    }
}
