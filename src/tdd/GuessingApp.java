package tdd;
import java.security.SecureRandom;
import java.util.Scanner;
public class GuessingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
// condition , statement, counter
        // FOR loop (count limit, condition, increment)
        // statement
        // while(condition,statement, increment)

        int no = 1 + random.nextInt(10);


        int number =0;
        while (number != -1) {
              System.out.println("Guess the number or -1 to quit");
            number = input.nextInt();
            if (number == no) {
                System.out.println("wow perfect, The number is: " + no);
                break;
            } else if (number > no) {
                System.out.println("Too high");

            } else {
                System.out.println("Too low");
            }


        }

    }
}
