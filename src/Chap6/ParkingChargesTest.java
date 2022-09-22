package Chap6;
/*(Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges
to determine the charge for each customer.
 */

import java.util.Objects;
import java.util.Scanner;

public class ParkingChargesTest {
    public static void main(String[] args) {
        ParkingCharges charge = new ParkingCharges(2.0,3," ");
        Scanner in =new Scanner(System.in);

        String name = null;
        double hours = 1;




            double sum =0;

            while (hours != -1) {


                System.out.println("\nenter your name");
                name = in.next();
                charge.setName(name);
                System.out.println("Enter duration ");
                hours = in.nextDouble();
                if (hours == -1) {
                    break;
                }
                if (hours > 24 || hours < 0.0){
                    System.out.println("Invalid range");
                    break;
                }
                charge.setDuration(hours);
                System.out.println();
                System.out.printf("The charge for %s  is %f", charge.getName(), charge.calculateCharges());

            }

        System.out.printf("%n The total for yesterday's receipt is : %.2f",sum);

       int duration =1;

        while (duration != -1){
            System.out.println("\nenter your name");
            name = in.next();
            charge.setName(name);

            System.out.println("Enter duration ");
            duration = in.nextInt();
            charge.setDuration(duration);
            if (duration ==-1 || duration > 24){
                break;
            }
            charge.setDuration(duration);
            System.out.println();
            System.out.printf("The charge for %s  is %f",charge.getName(),charge.calculateCharges());

            }



    }



}
