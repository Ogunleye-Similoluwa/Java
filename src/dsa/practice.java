package dsa;

import java.util.Arrays;

public class practice {
    public static int [] myMethod(int [] array1, int[] array2, int index){
       int count =0;
        for (int i = 0; i < array1.length; i++){
            for (int j = index; j < array2.length; j++){
                array2[count] = array1[index];
                count++;
            }
        }
        return array2;
    }

    public static void main(String[] args) {
        int [] array1 = {5,6,7,8};
        int [] array2 = new int[4];
        int index = 2;
        System.out.println(Arrays.toString(myMethod(array1, array2, index)));
    }
}
