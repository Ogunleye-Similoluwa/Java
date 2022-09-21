package tdd;


import Chap3.Clock;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Clock casio = new Clock(0, 0, 0);

        System.out.printf("The initial time is : %d hour: %d min : %d sec ",casio.getHour(),casio.getMinute(),casio.getSecond());

        casio.setHour(12);
        System.out.println("The number of hours is: " + casio.getHour() );
    }
}
