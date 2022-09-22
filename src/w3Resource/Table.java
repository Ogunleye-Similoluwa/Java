package w3Resource;

import java.util.Scanner;



public class Table{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
            System.out.print("enter number");
              int no = input.nextInt();
         
  		int A1 = 1;
		int A2 = 2;
            int A3 = 3;
		int B1 = 4;
		int B2 = 5;
            int C1 = 6;
 		int C2 = 7;
		int D1 = 8;
		int D2 = 9;
            int D3 = 10;
		
		int a1 = A1 * no ;
    		int a2 = A2 * no;
  		int a3 = A3 * no;
            int a4 = B1 * no;
            int a5 = B2 * no;
		int a6 = C1 * no;
		int a7 = C2 * no;
		int a8 = D1 * no;
		int a9 = D2 * no;
		int a10 = D3 * no;
		

          
    System.out.printf("%d%n",a1);
    System.out.printf("%d%n",a2);
    System.out.printf("%d%n",a3);
    System.out.printf("%d%n",a4); 
    System.out.printf("%d%n",a5);
     System.out.printf("%d%n",a6);
    System.out.printf("%d%n",a7); 
    System.out.printf("%d%n",a8);
    System.out.printf("%d%n",a9);
    System.out.printf("%d%n",a10);
	}
}