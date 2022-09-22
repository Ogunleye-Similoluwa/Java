package chap5;
/* (Extremes) Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input.*/

import java.util.Scanner;

public class Extreme {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int secondLargest =0 ;
        int total= 0;
         int number;
        for (int count = 1; count <= 5; count++ ){
            System.out.println("Enter numbers");
            number  = in.nextInt();
            if (number > largest){
                secondLargest = largest;
                largest = number;
            }
           else if (number > secondLargest){
                secondLargest = number  ;
            }
        }
        total+= largest + secondLargest;
        System.out.println("The first extreme number is  : " +largest);
        System.out.println("The second extreme number is  : " + secondLargest);
        System.out.println("The total of the two extremes numbers is : " + total);
    }
}
