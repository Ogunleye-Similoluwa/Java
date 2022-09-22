package w3Resource;

public class PrimeNo {
    public static void main(String[] args) {
        int sum = 1;
        int counter = 0;
        int number = 0;

        while (counter < 100) {
            number++;
            if (number % 2 != 0) {
                sum+=number;


            }
            counter++;

        }
        System.out.println("Sum of the prime no: " + sum);
    }

}
