
import java.util.Scanner;
 public class Temperature {
     public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      System.out.print("enter amount of water in kilograms"); // prompt
        double M = input.nextDouble();  
        
       System.out.print("enter initialTemperature"); //prompt
          double initialTemperature  = input.nextDouble();
       
       System.out.print("enter finalTemperature"); // prompt
          double finalTemperature  = input.nextDouble();
     
           double Q = M * (finalTemperature - initialTemperature) * 4184 ;
          
            System.out.printf("enery is %f", Q);
    }



}