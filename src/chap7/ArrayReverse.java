package chap7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] array = {10,15,20,25};
        int[] newArray = reverse(array);
        for (int i : newArray) {
            System.out.print(i);

        }
    }
    public static int []  reverse(int ... rev){
        int[] arr = new int[rev.length];
        int secondArray = 0;
        for (int i = rev.length -1; i >= 0; i--) {
            arr[secondArray] = rev[i];
            secondArray++;
        }
        return arr;
    }
}
