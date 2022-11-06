package chap7;

import java.util.Arrays;

public class ArrayManipulation {
    public static int[] num(int [] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array + " ,");

        }
        return array ;
    }

    public static void main(String[] args) {
        int [] array = new int[11];
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " , ");
        }
        System.out.println();
        char [] chars = {'x','o','x'};
            System.out.print(Arrays.toString(chars));




    }

}
