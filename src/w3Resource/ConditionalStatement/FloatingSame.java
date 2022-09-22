package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class FloatingSame {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Enter first number");
        Double number1 = in.nextDouble();
        System.out.println("Enter second number");
        Double number2 = in.nextDouble();

        if ((number1 - number2) <= 0.01){
            System.out.println("Number are the same");
        }
        else {
            System.out.println("Number are different");
        }
    }
}
