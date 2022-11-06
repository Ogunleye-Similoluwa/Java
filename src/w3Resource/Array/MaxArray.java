package w3Resource.Array;

public class MaxArray {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max =array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

}
