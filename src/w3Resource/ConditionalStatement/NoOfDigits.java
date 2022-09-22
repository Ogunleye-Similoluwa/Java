package w3Resource.ConditionalStatement;
/*Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.*/

import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" Enter number less that ten billion");
        long num = in.nextLong();
        int digits = 0;
        if (num >=1 && num < 10){
            digits = 1;
        }
        if (num >= 10 && num < 100){
            digits = 2;
        }
        if (num >= 100 && num < 1000){
            digits = 3;
        }
        if ( num >=1000 && num < 10000) {
            digits =4;
        }
        if (num >= 10000 && num < 100000) {
            digits = 5;
        }
        if (num >= 100_000 && num < 1_000_000) {
            digits = 6;

        }
        if (num > 1_000_000 && num < 10_000_000){
            digits = 7;
        }
        if (num >= 10_000_000 && num< 100_000_000) {
            digits = 8;
        }
        if (num >=100_000_000 && num < 1_000_000_000){
            digits = 9;
        }
        if (num >= 1_000_000_000 && num < 10_000_000_000L) {
            digits = 10;
        }
        if (num >= 10_000_000_000L){
            digits = 11;
            System.out.println("Num is greater than ten billion");

        }
        else if(num <=0) {
            System.out.println("Invalid number");
        }
        System.out.println("Digits : " + digits);
    }


}
