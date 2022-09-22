package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class NumberOfYearsAndMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of month");
        int Month = input.nextInt();
        System.out.println("Enter year");
        int year = input.nextInt();
        int numberOfDays ;

        switch (Month){
            case 1:
                numberOfDays =31;
                System.out.println("January " + year + " has " + numberOfDays + " days");
                break;
            case 2:
                if (year % 4 == 0 ) {
                    numberOfDays = 29;
                    System.out.println("February " + year + " has " + numberOfDays + " days");
                }
                    else if (year % 4  !=0 ) {
                        numberOfDays = 28;
                        System.out.println("February " + year + " has " + numberOfDays + " days" );

                }
                break;
            case 3:
                numberOfDays= 31;
                System.out.println("March " + year + " has " + numberOfDays + " days");
                break;
            case 4:
                numberOfDays= 30;
                System.out.println("April " + year + " has " + numberOfDays + " days");
                break;
            case 5:
                numberOfDays= 31;
                System.out.println("May " + year + " has " + numberOfDays + " days");
                break;
            case 6:
                numberOfDays= 30;
                System.out.println("June " + year + " has " + numberOfDays + " days");
                break;
            case 7:
                numberOfDays= 31;
                System.out.println("July " + year + " has " + numberOfDays + " days");
                break;
            case 8:
                numberOfDays= 31;
                System.out.println("August " + year + " has " + numberOfDays + " days");
                break;
            case 9 :
                numberOfDays= 30;
                System.out.println("September " + year + " has " + numberOfDays + " days");
                break;
            case 10:
                numberOfDays= 31;
                System.out.println("October " + year + " has " + numberOfDays + " days");
                break;
            case 11:
                numberOfDays= 30;
                System.out.println("November " + year + " has " + numberOfDays + " days");
                break;
            case 12:
                numberOfDays= 31;
                System.out.println("December " + year + " has " + numberOfDays + " days");
                break;
            default:
                System.out.println("Invalid");


        }
    }
}
