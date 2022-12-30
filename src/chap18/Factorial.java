package chap18;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        calculateFactorial(4);

    }
    public static  void calculateFactorial(int num){
        System.out.println( IntStream.rangeClosed(1,num).
                reduce(1,(x,y) -> x * y));
    }
}
