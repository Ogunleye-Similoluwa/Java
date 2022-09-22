package chap4;

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int num1 ;
        int num2 ;
        int Luck = 25;
        int count = 0;
        while (count >=0 ){

            System.out.println("Enter number");
             num1 = in.nextInt();
            System.out.println("Enter number");
             num2 = in.nextInt();
            int sum = num1 + num2;

            if (sum == Luck){
                System.out.println("Nice");
                System.out.println("The Lucky number is 25");
                break;
            }
            else {
                System.out.println("opps, wrong");
                System.out.println("""
                        Would you like to continue ?
                        
                        if yes press 1 :
                        if No press 2 :
                        """);
                int choice = in.nextInt();
                if (choice ==1){
                }
                else {
                    break;
                }
            }

        }
    }
}
