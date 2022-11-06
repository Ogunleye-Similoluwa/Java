package w3Resource.Array;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int indexPosition = 3;
        int newValue = 76;

//        for (int i = array.length -1; i > indexPosition; i--){
//            array[i] = array[i -1];
//        }
        array[indexPosition] = newValue;
        System.out.println(Arrays.toString(array));
    }
}
