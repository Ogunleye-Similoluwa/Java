package Chap6;
/* (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
second integer is a multiple of the first. The method should take two integer arguments and return
true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
time) and determines whether the second value in each pair is a multiple of the first.*/

import java.util.Scanner;

public class Multiple {
    public void isMultiple(int num1, int num2){
        if (num1 % num2 == 0 || num2 % num1  == 0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Multiple cal = new Multiple();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter second Number");
        int num2 = in.nextInt();
        cal.isMultiple(num1,num2);

    }
}
