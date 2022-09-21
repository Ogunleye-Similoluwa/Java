package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a");
        Double a = in.nextDouble();
        System.out.println("Enter b");
        double b = in.nextDouble();
        System.out.println("Enter c");
        double c = in.nextDouble();

        double d = b * b - 4.0 * a * c;

        if (d > 0){
            double root1 = -b + Math.sqrt(d)/ 2 * a;
            double root2= -b - Math.sqrt(d)/ 2 * a;
            System.out.printf("The roots of the equation are root1:%f  and root2 : %f ",root1 , root2);
        }
        else if (d ==0){
            double root = -b/2 * a;
            System.out.printf("The root of the equation is %f",root);
        }
        else {
            System.out.println("No number was entered");
        }

    }
}
