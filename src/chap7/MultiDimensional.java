package chap7;

import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        char[][] array = {{'X', 'O', 'X'}, {'X', 'O', 'X'}, {'X', 'X','O'}};
        System.out.println(Arrays.deepToString(array));
        System.out.println();
      for (char[] i : array) {
          System.out.print(i);
          System.out.println("");
      }
        System.out.println();
      for (int i = 0; i < array.length; i++) {
          for (int j = 0; j < array.length ; j++) {
              System.out.print(array[i][j] + " ");
          }
          System.out.println();
      }
    }
}
