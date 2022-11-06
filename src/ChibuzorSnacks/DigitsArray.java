package ChibuzorSnacks;

import java.util.Arrays;

public class DigitsArray {
    public static int[] arrDigits( int value) {
        int a = String.valueOf(value).length();
        int[] array = new int[a];
        int[] result = new int[array.length];
        int count = result.length -1;

        for (int i = 0; i < array.length  ; i++) {
            int  remainder =  value % 10;
            array[i] +=remainder ;
            value = value / 10;
        }
        for (int i = 0; i < result.length; i++) {
            result[count] = array[i];
            count--;
        }
        return result;
    }
    public static void main(String[] args) {
        int val = 213465;
        System.out.println((Arrays.toString(arrDigits(val))));
    }

}
