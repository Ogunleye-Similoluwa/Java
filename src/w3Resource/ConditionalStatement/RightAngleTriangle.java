package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i ; j++)
                    System.out.print(j);
                System.out.println();
            }




    }
}