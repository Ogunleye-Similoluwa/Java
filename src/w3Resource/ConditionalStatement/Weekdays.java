package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String daysOfTheWeek = " ";

            System.out.print("Enter number of day :");
           int numberOfDays = in.nextInt();


            switch (numberOfDays) {
                case 1:
                    daysOfTheWeek = "MONDAY";
                    System.out.println(daysOfTheWeek);
                    break;
                case 2:
                    daysOfTheWeek = "TUESDAY";
                    System.out.println(daysOfTheWeek);
                    break;
                case 3:
                    daysOfTheWeek = "WEDNESDAY";
                    System.out.println(daysOfTheWeek);
                    break;
                case 4:
                    daysOfTheWeek = "THURSDAY";
                    System.out.println(daysOfTheWeek);
                    break;
                case 5:
                    daysOfTheWeek = "FRIDAY";
                    System.out.println(daysOfTheWeek);
                    break;
                case 6:
                    daysOfTheWeek = "SATURDAY";
                    System.out.println(daysOfTheWeek);
                    break;
                case 7:
                    daysOfTheWeek = "SUNDAY";
                    System.out.println(daysOfTheWeek);
                    break;
                default:
                    System.out.println("Invalid day range");
                    break;

            }

    }
}
