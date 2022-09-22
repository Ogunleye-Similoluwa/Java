package chap2.chap2TDD;

public class Arithmetic {
    public int firstSquare(int num1) {
        return num1 * num1;
    }

    public int secondSquare(int num2) {
        return num2 * num2;
    }

    public int addSquares(int num1, int num2) {
        int result =0;
         result = (num1 * num1) + (num2 * num2);
        return result;
    }

    public int subtractSquares(int num1, int num2) {
        int result =0;
        result = (num1 * num1) - (num2 * num2);
        return Math.absExact(result);
    }
}
