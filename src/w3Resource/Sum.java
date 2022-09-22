package w3Resource;

import java.util.Scanner;



public class Sum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
     
     System.out.print("enter first number");
          int firstNumber = input.nextInt();
     System.out.print("enter second number");
          int secondNumber = input.nextInt();

          int Add = firstNumber + secondNumber ;
    System.out.println("The sum of the two numbers is" + Add);
 	
	}
}