package Chap6;

import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter celsius temperature: ");
        double kelvin = in.nextDouble();
        System.out.print("Enter kelvin temperature: ");
        double celsius = in.nextDouble();
        System.out.println("Temperature in  kelvin is: " +Temperature.kev(celsius));
        System.out.println("Temperature in celsius is: " +Temperature.cel(kelvin) );


    }
}
