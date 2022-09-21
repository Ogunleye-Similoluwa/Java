package w3Resource;
import java.util.Scanner;
public class AggregateFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number");
        int integer = input.nextInt();
        System.out.print("enter second number");
        int integer2 = input.nextInt();

        if (integer == integer2){
            System.out.printf("%d = %d%n",integer,integer2);
        }

        if (integer != integer2){
            System.out.printf("%d != %d%n",integer,integer2);
        }

        if (integer <= integer2){
            System.out.printf("%d <= %d%n",integer,integer2);
        }

        if (integer >= integer2){
            System.out.printf("%d >= %d%n",integer,integer2);
        }

        if (integer < integer2){
            System.out.printf("%d < %d%n",integer,integer2);
        }

        if (integer > integer2){
            System.out.printf("%d > %d%n ",integer,integer2);
        }
    }
}
