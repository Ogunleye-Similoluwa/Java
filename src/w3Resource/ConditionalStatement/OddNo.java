package w3Resource.ConditionalStatement;

import java.util.Scanner;

public class OddNo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count;
        int sum= 0;
        System.out.println("Enter number");
        int num = in.nextInt();
        for (count =1 ; count <= num ; count++){
            System.out.println(  2 * count -1);
            sum+= 2 * count -1 ;
        }
        System.out.println(" The sum of the odd numbers are : "+ sum);



        }



}
