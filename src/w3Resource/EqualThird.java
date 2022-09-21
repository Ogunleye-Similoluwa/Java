package w3Resource;

import java.util.Scanner;

public class EqualThird {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("enter first integer");
                int no1 = input.nextInt();
                System.out.print("enter second integer");
                int no2 = input.nextInt();
                System.out.print("enter third integer");
                int no3 = input.nextInt();

                int sum = no1 + no2;
                if (sum == no3){
                    System.out.println("True");
                }
                else {
                    System.out.println("false");
                }
    }
}
