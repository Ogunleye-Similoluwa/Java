package w3Resource.Array;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to sort a numeric array and a string array.
public class SortOut {
    public static void main(String[] args) {
        int [] num = {38,56,32,45,78,54,123,6446,78,4,5,54,78,8,78,4,4,54,56,43,65,68,54,};
        String [] wow = {"simex", "Henry", " Adeola","Seun","SS void","PonPon"};
      //  System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
//        System.out.println(Arrays.toString(wow));
//        Arrays.sort(wow);
//        System.out.println(Arrays.toString(wow));

    }
}
