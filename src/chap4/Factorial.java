package chap4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int num = in.nextInt();
        int factorial =  1;

        for ( int count  = 1 ; count <= num  ; count++){
            factorial = factorial * count ;
        }
        System.out.printf("""
                The factorial  of %d is : %d
                """, num,factorial);
    }
}
