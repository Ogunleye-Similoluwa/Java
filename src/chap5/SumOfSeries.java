package chap5;
/*(The Sum of a Series) Find the summation of the sequence of numbers 1, 2, 3 … n, where
        n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the
        corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
        with the variable that accumulates the product*/

public class SumOfSeries {
    public static void main(String[] args) {
        int sum = 0;
        int count;
        System.out.printf("%n%5s%5s", "count", "sum");
        for (count = 1; count <= 100; count++) {
            sum += count;
            System.out.printf("%n%5d%5d", count, sum);

        }



    }
}
