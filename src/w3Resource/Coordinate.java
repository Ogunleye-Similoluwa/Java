package w3Resource;

import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter latitude of coordinate 1");
        double x1 = input.nextDouble();
        System.out.print("enter longitude of coordinate 1  ");
        double y1 = input.nextDouble();
        System.out.print("enter  latitude of coordinate 2 ");
        double x2 = input.nextDouble();
        System.out.print("enter  longitude of coordinate 2");
        double y2 = input.nextDouble();

        double r =  6371.01;

        double d =  r * Math.acos(Math.sin(x1)) * (Math.sin(x2)) + (Math.cos(x1)) * (Math.cos(x2)) * (Math.cos(y1 - y2));
        System.out.printf("The distance between those point is :%f",d);

            }
}
