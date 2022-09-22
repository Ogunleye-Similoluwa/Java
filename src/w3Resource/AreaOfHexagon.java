package w3Resource;
import java.util.Scanner;



public class AreaOfHexagon{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 System.out.print("enter lengthof side");
         double side = input.nextDouble();
        double area = (6* side*side )/(4*(Math.tan(Math.PI/6)));
        System.out.printf("The area of hexagon is:%f",area);


    }



}
