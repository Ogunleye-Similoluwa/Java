package Chap6;
/*(Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given.
 The method should take two arguments of type double and return the hypotenuse as a double. Incorporate this method into an
application that reads values for side1 and side2 and performs the calculation with the hypotenuse
method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.14. [Note: Class Math also provides method hypot to perform this calculation.]*/

import java.util.Scanner;

public class HypotenuseCalculation {

    public double hypotenuse( double opposite, double adjacent) {
       double hypotenuse =  Math.sqrt((Math.pow(opposite,2)) + ((Math.pow(adjacent,2))));
       return hypotenuse;
    }

    public static void main(String[] args) {
        HypotenuseCalculation cal = new HypotenuseCalculation();
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the first side");
        double side1 = in.nextDouble();
        System.out.println("Enter the second side");
        double side2 = in.nextDouble();

        System.out.printf("The hypotenuse is : %.2f",cal.hypotenuse(side1,side2));

    }

}
