import java.util.Scanner;



public class CarApplication{
 
	public static void main(String []   args){
   
		Car myCar = new Car(" OS-Mercedes-Benz","2022 editon", 2000000000.00);
		Car mySimex = new Car("OS-Lamborghini"," 2022 edition",2500000000.00);

       	System.out.printf("Model:%s%n", myCar.getModel());
	 	System.out.printf("Year:%s%n",myCar.getYear());
       	System.out.printf("Price :%.2f%n",myCar.getPrice());
	 
	 	System.out.println();
	 	System.out.println();

		System.out.printf("Model:%s%n", mySimex.getModel());
	 	System.out.printf("Year:%s%n",mySimex.getYear());
       	System.out.printf("Price :%.2f%n",mySimex.getPrice());

            System.out.println();
	 	System.out.println();

	 

            
		
		System.out.printf("Apply five percent discount:%.2f%n", myCar.getDiscount1());
		System.out.printf("Apply seven percent discount:%.2f", mySimex.getDiscount2());

	}

}