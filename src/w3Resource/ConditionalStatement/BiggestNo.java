package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class BiggestNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = in.nextInt();
        System.out.println("Enter second number");
        int number2 = in.nextInt();
        System.out.println("Enter third number");
        int number3 = in.nextInt();
        if (number1 > number2 && number1 > number3){
            System.out.printf("The biggest number is %d",number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.printf("The biggest number is %d",number2);
        } else if (number3 > number1 && number3> number2) {
            System.out.printf("The biggest number is %d",number3);

        }
    }
}
