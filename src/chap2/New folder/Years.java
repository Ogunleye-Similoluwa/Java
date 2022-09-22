
import java.util.Scanner;
 public class Years {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       System.out.print("enter number of minutes: ");
        int minutes = input.nextInt();
        
          int Year = 525600 ;
          int Days = 1440;
           
         
         int Years = minutes / Year  ;
          int days = (minutes % Year) / Days;
          
          
            System.out.printf("The number of Years is %d", Years );
            System.out.printf( "and %d Days", days);
   }



}