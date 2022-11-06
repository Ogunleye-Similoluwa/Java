package ChibuzorSnacks;

import java.util.Arrays;

public class ReverseArray {
    public static int [] reverse(int[] array) {
        int [] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 -i];
        }
        return result;
    }
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(reverse(array)));
    }
}
