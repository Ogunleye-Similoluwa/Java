package chap4;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int num = in.nextInt();
        if(num > 0 && num <= 10){
        for (int i= 1 ; i <=num; i++ ) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();

        }
        }
        else {
            System.out.println("Invalid range of numbers");
        }



    }
}
