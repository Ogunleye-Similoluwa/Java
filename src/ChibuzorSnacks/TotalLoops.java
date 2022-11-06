package ChibuzorSnacks;

public class TotalLoops {
    public static int forLoopTotal(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static int whileLoopTotal(int[] array) {
        int sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }

        return sum;
    }
    public static int doWhileLoopTotal(int[] array) {
        int sum = 0;
        int i = 0;
        do {
            sum += array[i];
            i++;
        }
        while (i < array.length);

        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(forLoopTotal(array));
        System.out.println(whileLoopTotal(array));
        System.out.println(doWhileLoopTotal(array));
    }
}
