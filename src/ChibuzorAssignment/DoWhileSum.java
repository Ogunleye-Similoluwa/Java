package ChibuzorAssignment;

import java.util.Scanner;

public class DoWhileSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int count = 0;
        int total;

        int choice;
        do {
            System.out.print("Enter first number or -1 to quit:");
            number1 = input.nextInt();
            if (number1 == -1){
                break;
            }

            System.out.print("Enter second number or -1 to quit:");
            number2 = input.nextInt();
            if (number2 == -1){
                break;
            }
            count = count + 1;

            total = number1 + number2;
            System.out.printf(" The sum of the numbers is :%d %n", total);


            System.out.println(" continue ?  \n if yes press : 1 \n if no press : 0");
            choice = input.nextInt();
            if (choice!= 1 && choice != 0) {
                System.out.println("Enter 1 to continue or 0 to exit");
                choice = input.nextInt();
            }

        }
        while (choice == 1  );



    }
}
