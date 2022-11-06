package Chap6;
/*(Perfect Numbers) An integer number is said to be a perfect number if its factors, including
1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
the factors of each perfect number to confirm that the number is indeed perfect.
 Challenge the computing power of your computer by testing numbers much larger than 1000. Display the results.
 */

public class PerfectNumber {
    public static int isPerfect(int number) {

        int total = 0;
        for (int i = 1; i < number ;i++ ) {
            if (number % i == 0) {
                total += i;
                if (total == number) {
                    System.out.println("This is a perfect number");
                }
            }
        }

        return total;
    }


    public static void main(String[] args) {
        int number = isPerfect(1000);
        System.out.println(number);
    }
}