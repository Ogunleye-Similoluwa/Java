package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class Asterisks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num = in.nextInt();

        for(int i  =num ; i > 0 ; i --){
            for (int j = num -1 ; j > 0 ; j--) {
                System.out.println(" ");
            }
                for (int k= 0 ; k < i ; k++){
                    System.out.print(" * ");
                }
                System.out.println();
        }
    }
}
