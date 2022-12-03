package chap4;

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter number");
        int num = in.nextInt();
        int count = 0;
        while (count >=0 ){

            System.out.println("Enter an integer");
             int num1 = in.nextInt();
            System.out.println("Enter an integer");
            int  num2 = in.nextInt();
            int sum = num1 + num2;

            if (sum == num || sum > num){
                System.out.println("Nice");
                break;
            }
            else {
                System.out.println("opps, wrong");
                count++;

            }

        }
    }
}
