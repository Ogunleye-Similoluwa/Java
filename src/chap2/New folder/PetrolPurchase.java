
   
import java.util.Scanner;

public class PetrolPurchase{
     


	public static void main(String [] args){
    
     		Petrol mySimex = new Petrol(" Ibadan", "Diesel" ,10, 310.25 , 165.75 , 20.00  );
     		

		System.out.printf("StationLocation: %s%n", mySimex.getStationLocation());
		System.out.printf(" PetrolType: %s%n",mySimex.getPetrolType());
              System.out.printf("The quantity in gallons is :%d ", mySimex.getQuantity());
		System.out.println();
		System.out.printf("PurchaseInLiter:%.2f%n", mySimex.getPurchaseInLiter());
		System.out.printf("PricePerLiter:%.2f%n", mySimex.getPricePerLiter());
              System.out.printf("PercentageDiscount:%.2f%n", mySimex.getPercentageDiscount());
		
 		System.out.println(); 
	 
		System.out.printf("My net amount is %.2f", mySimex.getPurchaseAmount());	
 	}


} 