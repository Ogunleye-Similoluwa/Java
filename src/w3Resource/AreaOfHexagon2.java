package w3Resource;

import java.util.Scanner;

public class AreaOfHexagon2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("enter lengthof side");
            double side = input.nextDouble();
            System.out.print("enter polygon side");
            double polyside = input.nextDouble();
            double area = (polyside* side * side )/(4*(Math.tan(Math.PI/polyside)));
            System.out.printf("The area of hexagon is:%f",area);


        }





}
