package w3Resource;
//3. Write a Java program that accepts three integers from the user and return true if the second number is greater
// than first number and third number is greater than second number.
// If "abc" is true second number does not need to be greater than first number. Go to the editor
//Sample Output:
//
//Input the first number : 5
//Input the second number: 10
//Input the third number : 15
//The result is: true

import java.util.Scanner;

public class ThreeInteger {
    public static void main(String[] args) {
                Scanner  input = new Scanner(System.in);


                System.out.print("enter first integer");
                int no1 = input.nextInt();

                System.out.print("enter second integer");
                int no2 = input.nextInt();

                System.out.print("enter third integer");
                int no3 = input.nextInt();

        if (no2 > no1 && no3 > no2){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }




    }
}
