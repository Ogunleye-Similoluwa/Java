package ChibuzorAssignment;

import java.util.Scanner;

public class PowerMod {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = input.nextInt();
        System.out.println("Enter second number");
        int number2 = input.nextInt();
            int power = 1;
        while (number2 != 0){
            power = power * number1;
            number2--;
        }
        System.out.println(" " + power);
    }
}
