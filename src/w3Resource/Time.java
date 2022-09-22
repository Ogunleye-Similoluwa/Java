package w3Resource;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("enter number of seconds");
            int time = input.nextInt();

            int hrs = time/ 3600;
            int min = (time / 60) % 60;
            int sec = time % 60;
        System.out.printf("The Time is: %d hrs : %d min : %d sec",hrs,min,sec);

    }
}
