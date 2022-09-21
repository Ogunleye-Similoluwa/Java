package w3Resource;

import java.util.Scanner;



public class Float2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
     
    
          double no1 = 4.0;
          double no2 = 1;
          double no3 = 1.0;
          double no4 = 5;
          double no5 = 7;
           double no6 = 9;
            double no7 = 11;
          double no8 = 3;
     
           double operation = no1 * (no2 - (no3/no8) + (no3/no4) - (no3/no5) +(no3/no6) - (no3/no7));

    System.out.println("The operation of the numbers is\n" + operation);
 	
	}
}