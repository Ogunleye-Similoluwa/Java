package ChibuzorSnacks;

public class TwoLargest {
    public static int totalLargest(int[] array) {
        int max = 0;
        int secondMax = 0;
        for (int value : array) {
            if (value > max) {
                secondMax = max;
                max = value;
            }

        }
        return max + secondMax;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(totalLargest(array));
    }
}
