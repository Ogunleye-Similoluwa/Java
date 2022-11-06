package ChibuzorSnacks;

public class LargestElement {
    public static int largest(int [] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 100, 7, 8, 9, 10};
        System.out.println(largest(arr));
    }
}
