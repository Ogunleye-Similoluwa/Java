package chap4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter second number");
        int num2 = in.nextInt();

        if (num1 == num2){
            System.out.println("0");
        }
        if (num1 > num2){
            System.out.println("1");
        }
        if (num2 > num1){
            System.out.println("-1");
        }
    }
}
