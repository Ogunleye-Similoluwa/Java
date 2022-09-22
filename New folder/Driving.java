import java.util.Scanner;




public class Driving{
	public static void main(String[] args){ 

		Scanner input = new Scanner(System.in);

		System.out.print("enter driving  distance:");
		double distance = input.nextDouble();
		System.out.print(" enter miles per gallon:");
		double miles = input.nextDouble();
		System.out.print("enter price per gallon:");
            double price = input.nextDouble();
    		
		double drivingCost = (distance / miles) * price ;
    
  		System.out.printf("The driving cost is:%.2f", drivingCost);
	}
}