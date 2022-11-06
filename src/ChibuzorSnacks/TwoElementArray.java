package ChibuzorSnacks;

import java.util.Arrays;

public class TwoElementArray {
    public static int [] twoArray(int[] array){
        int [] newArray = new int[array.length];
        for (int i = 0; i < newArray.length-1;){
            newArray[1] = array[i];
            i++;
            newArray[0] = array[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array ={8,1};
        System.out.println(Arrays.toString(twoArray(array)));
    }
}
