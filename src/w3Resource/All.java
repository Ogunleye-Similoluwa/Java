package w3Resource;

import java.util.Scanner;



public class All {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int A1 = -5;
        int A2 = 8;
        int A3 = 6;
        int B1 = 55;
        int B2 = 9;
        int C1 = 20;
        int C2 = -3;
        int D1 = 15;
        int D2 = 2;
        int D3 = 3;
        int D4 = 5;
        int D5 = -8;

        int a1 = A1 + A2 * A3;
        int a2 = (B1 +B2)%B2;
        int a3 = C1 + C2 * D4/A2;
        int a4 = D4 + D1/ D3*D2 - A2 % D3;


        System.out.printf("%d%n",a1);
        System.out.printf("%d%n",a2);
        System.out.printf("%d%n",a3);
        System.out.printf("%d%n",a4);

    }
}
