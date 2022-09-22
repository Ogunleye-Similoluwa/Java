package w3Resource;

import java.util.Scanner;



public class Multiplication{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
     
     System.out.print("enter first number");
          int firstNumber = input.nextInt();
     System.out.print("enter second number");
          int secondNumber = input.nextInt();

          int multiply = firstNumber * secondNumber ;
    System.out.println("The multiplication of the two numbers is \n" + multiply);
 	
	}
}