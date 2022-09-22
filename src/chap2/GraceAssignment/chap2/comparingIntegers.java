package chap2;
/*(Comparing Integers) Write an application that asks the user to enter one integer, obtains
        it from the user and displays whether the number and its square are greater than, equal to, not equal
        to, or less than the number 100. Use the techniques shown in Fig. 2.15*/

import java.util.Scanner;

public class comparingIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter integer");
        int integer = in.nextInt();

        int square = integer * integer;

        if (integer > 100){
            System.out.println(integer +" > 100 ");
        }
        if (square > 100){
            System.out.println(square + " > 100");
        }
        if (integer == 100){
            System.out.println(integer +" = 100");
        }
        if (square == 100){
            System.out.println(square + " = 100");
        }
        if (integer != 100){
            System.out.println(integer +" != 100");
        }
        if (square != 100){
            System.out.println(square + " != 100");
        }
        if (integer < 100){
            System.out.println(integer +" < 100");
        }
        if (square < 100){
            System.out.println(square + " < 100");
        }

    }
}



