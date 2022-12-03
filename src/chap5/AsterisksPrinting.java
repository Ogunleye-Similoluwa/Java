package chap5;

import java.util.Scanner;

public class AsterisksPrinting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number = in.nextInt();

        for (int i = 1 ; i <= number; i++){
            System.out.print(" * ");
        }


    }
}

