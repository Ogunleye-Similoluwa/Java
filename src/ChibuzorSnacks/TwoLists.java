package ChibuzorSnacks;

import java.util.Arrays;

public class TwoLists{
    public static void concat( int[] array,String[] array2) {
        int count = 0;
        String[] newArray = new String[array.length + array2.length];
        for (int j : array) {
            newArray[count] = String.valueOf(j);
            count++;
        }
            for (String s : array2) {
                newArray[count]  =  s;
                count++;
            }
            Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));

    }
    public static int [] concat2( int[] array,int[] array2) {
        int [] total = new int[array.length + array2.length];
        int index = 0;
       int length = array.length + array2.length;
        while (index < length -1) {
            if (index % 2 == 0) {
                total[index] = array[index];
            }
            if (index % 2 != 0) {
                total[index] = array2[index];
            }
            index += 1;
        }
        return total;
    }

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        String[] stringArray ={"a", "b", "c", "d", "e"};
        int []  array2 = {1, 2, 3, 4, 5};
        int[] array3 = {6,7, 8, 9, 10};
        concat(array,stringArray);
        System.out.println(Arrays.toString(concat2(array2, array3)));
    }
        }
