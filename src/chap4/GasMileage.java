package chap4;
//(Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
 //       kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//        a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//        The program should calculate and display the miles per gallon obtained for each trip and print the
//        combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//        produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
//        from the user.

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles driven or -1 to quit");
        int miles = input.nextInt();
        System.out.println("Enter gallons used or -1 to quit");
        int gallons = input.nextInt();


            double  milesPerGallon=0;
            double total = 0;
            int count = 0;
            double average = 0;
            while (miles != -1 && gallons != -1) {
                if (miles > 0 && gallons > 0)
                    total = (double) miles / gallons;
                count++;


                System.out.printf("the miles per gallon is for each trip is %.2f :", total);

                System.out.println("\nEnter miles driven or -1 to quit");
                miles = input.nextInt();
                System.out.println("Enter gallons used or -1 to quit");
                gallons = input.nextInt();
            }
                    if (total != 0){

                        milesPerGallon = total + milesPerGallon;

                        average = milesPerGallon/count;

                    }

        System.out.printf("The number of trips is %d total mile per gallon for all the trip is %.2f: and the average is %f ",count,milesPerGallon,average);




    }
}
