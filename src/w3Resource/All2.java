package w3Resource;

import java.util.Scanner;



public class All2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
     
     System.out.print("enter first number");
          int firstNumber = input.nextInt();
     System.out.print("enter second number");
          int secondNumber = input.nextInt();

          int add = firstNumber + secondNumber ;
	     int subtract = firstNumber - secondNumber ;
		int multiply = firstNumber * secondNumber ;
		int divide = firstNumber / secondNumber ;
		int mod = firstNumber % secondNumber ;
    System.out.println("The Addtion of the two numbers is\n" + add);
     System.out.println("The subtraction of the two numbers is\n" + subtract);
 	 System.out.println("The multiplication of the two numbers is\n" + multiply);
     System.out.println("The Divison of the two numbers is\n" + divide);
      System.out.println("The modulus of the two numbers is\n" + mod);
	}

}