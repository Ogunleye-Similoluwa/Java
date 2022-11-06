package w3Resource.Array;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int [] newArray = new int[10];

        for (int i= 0 ; i < array.length; i++){
            newArray[i] =array[i];
        }
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}
