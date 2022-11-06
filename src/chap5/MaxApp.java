package chap5;

import java.util.Scanner;

public class MaxApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 1;
        int counter = 1;
        int min= Integer.MAX_VALUE;

        while (counter <= 5) {
            System.out.println("Enter a number " + count);
            int num = input.nextInt();

            if (num > 0 && num < 100) {
                if (max < num) {
                    max = num;
                } else if (min > num) {
                    min = num;
                }
                counter++;
                count++;
            }
            }
        System.out.println("Maximum :" + max);
        System.out.println("Minimum :" + min);
        }

    }


