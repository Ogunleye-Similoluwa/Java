package w3Resource;

import java.util.Scanner;



public class Average{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
     
     System.out.print("enter first number");
          int firstNumber = input.nextInt();
     System.out.print("enter second number");
          int secondNumber = input.nextInt();
	System.out.print("enter third number");
          int thirdNumber = input.nextInt();


          int Average = (firstNumber + secondNumber + thirdNumber) / 3 ;
    System.out.println("The Average of the three integers is:" + Average);
 	
	}
}