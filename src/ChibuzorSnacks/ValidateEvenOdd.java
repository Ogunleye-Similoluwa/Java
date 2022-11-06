package ChibuzorSnacks;

public class ValidateEvenOdd {
    public static void validateOdd(int [] array) {
        for (int value : array) {
            if (value % 2!= 0) {
                System.out.println(value);
            }
        }
    }
    public static void validateEven(int [] array) {
        for (int value : array) {
            if (value % 2== 0) {
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {12,4,54,32,54,65,4,32,43,23,5,4};
        validateOdd(array);
        validateEven(array);
    }
}
