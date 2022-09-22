
import java.util.Scanner;
 public class Feet {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("enter number of Feet");
      double meter = input.nextDouble();
      
       double Feet = meter * 0.305;
          
          
            System.out.printf("number of meters %f", Feet);
    }



}