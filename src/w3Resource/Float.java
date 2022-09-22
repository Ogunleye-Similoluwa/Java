package w3Resource;

import java.util.Scanner;



public class Float{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
     
    
          double no1 = 25.5;
          double no2 = 3.5;
          double no3 = 40.5;
          double no4 = 4.5;
     
           double operation = ((no1 * no2 - no2 *no2)/ (no3 - no4));

    System.out.println("The operation of the numbers is\n" + operation);
 	
	}
}