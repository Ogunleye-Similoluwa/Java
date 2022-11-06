package dsa;

import java.util.Arrays;

public class ArrayProblem {
    public static void main(String[] args) {
        int[][] array = new int[9][9];
        int count = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = col + 1 + row;
                if(array[row][col] > 9){
                    array[row][col] -=9;
                }
            }
        }

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0 ; j < array[i].length; j++) {
                System.out.print(array[i][j] +  "   ");
            }
            System.out.println();


        }

    }
}
