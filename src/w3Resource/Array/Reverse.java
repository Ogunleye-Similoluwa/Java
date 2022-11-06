package w3Resource.Array;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        for (int i= array.length - 1; i >= 0  ; i--){
            System.out.print(" " +array[i]);
        }
    }

    public static int[] reverseArray(int[] array) {
        for (int counter = 0; counter < array.length / 2; counter++) {
            int temp = array[counter];
            array[counter] = array[array.length - 1 - counter];
            array[array.length - 1 - counter] = temp;
        }
        return array;
    }
}
