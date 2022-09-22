package chap5;
/* (Integers Divisible by 3) Write an application that calculates the sum of those integers between
1 and 30 that are divisible by 3 */

public class Divisible3 {
    public static void main(String[] args) {
        int sum =0;
        for (int count = 1; count <=30; count++){
            if (count%3==0){
                sum += count;
            }
        }

        System.out.println("The sum of the numbers divisible by 3 is : " + sum);

    }
}
