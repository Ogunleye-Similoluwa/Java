
import java.util.Scanner;
 public class Acceleration {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("enter Vo");
        double Vo = input.nextDouble();
   
     System.out.print("enter V1");
        double V1 = input.nextDouble();
     
     System.out.print("enter t");
        double t = input.nextDouble();
    
         double a = ( V1 - Vo ) / t;
     
          
          
            System.out.printf("The average acceleration is %f", a);
    }



}