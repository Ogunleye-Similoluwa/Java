package ChibuzorAssignment;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int num = in.nextInt();

        for (int i = num ; i <=num ; i++){
            for (int j =1 ; j <=i  ; j++)
                System.out.print( "*");
            System.out.println();
        }
    }
}
