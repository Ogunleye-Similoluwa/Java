package w3Resource;
import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("enter first integer:");
        int no1 = input.nextInt();
        System.out.print("enter second integer:");
        int no2 = input.nextInt();

        int nu1 = no1 / no2;
        int nu2 = no1 - (nu1 * no2) ;

        System.out.printf("The mod is %d", nu2);


    }


}
