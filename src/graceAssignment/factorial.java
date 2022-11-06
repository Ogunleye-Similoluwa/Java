package graceAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter no of terms");
        int number = in.nextInt();
        int f = 0;
        int s = 1;
        int t;
        System.out.println(f);
        System.out.println(s);
        for (int i = 3; i <= number ; i++){
            t = f + s;
            System.out.println(t);
            f = s;
            s = t;
        }
        System.out.println();
        int [] arr = {1,2,3,5,6,7,3,5};
        for (int i = arr.length -1 ; i >= 0  ; i --){
//            for (int j = arr.length - 1; i < j; j--){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
            System.out.print(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println();

        System.out.println("Enter any number");
        int num = in.nextInt();
        int fact = 1;
        for (int i= 1; i <= num ; i++){
            fact = fact * i;
        }
        System.out.print(fact);
        System.out.println();
        System.out.print("Enter any number");
        int no = in.nextInt();
        int rem ;
        int reverse = 0;
        for (int i = no; i > 0; i = i/ 10){
            rem = i % 10;
            reverse = (reverse * 10) + rem;

        }
        System.out.print(reverse);
        System.out.println();
        if (no == reverse){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }

        System.out.println("Enter any character");
        String alpha = in.next();
        for (int count =0 ; count <=alpha.length() -1; count++){
                for (int j = alpha.length() -1; count< j; j--){
                    if (alpha.charAt(count) == alpha.charAt(j)){
                        System.out.println(" a palindrome");
                        System.exit(0);
                    }
                    else {
                        System.out.print ("not a palindrome");
                        System.exit(0);
                    }
        }
    }



    }
}
//    public static void stringPalindromes(String original) {
//        StringBuilder reverse = new StringBuilder(); // Object of String class
//        int length = original.length(); // converting the length of a string into integer
//        for ( int i = length - 1; i >= 0; i-- )
//            reverse.append(original.charAt(i));
//        if (original.equals(reverse.toString()))
//            System.out.println("\nEntered string/number is a palindrome.");
//        else
//            System.out.println("\nEntered string/number isn't a palindrome.");
//    }