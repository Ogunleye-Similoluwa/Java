package Chap6;
/* s the remainder operator (%) to determine whether ten input integers are divisible by 5 or not.
 The method should take an integer argument and return true if the integer is divisible by 5 and false otherwise. Incorporate this method
into an application that inputs a sequence of integers (one at a time) and determines the result.*/

import java.util.Scanner;

public class DivisibleBy5 {
    Scanner in = new Scanner(System.in);
    public  void divisible(){
        for (int num =1 ;num <= 10; num++){
            System.out.println("Enter number");
            int number = in.nextInt();
            if (number%5 == 0){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }

        }
    }

    public static void main(String[] args) {
        DivisibleBy5 div = new DivisibleBy5();
        div.divisible();
    }
}
