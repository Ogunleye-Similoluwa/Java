package Chap6;
/* You roll two dice. Each die has six faces, which contain one, two, three, four, five and
six spots, respectively. After the dice have come to rest, the sum of the spots on the two
upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
you must continue rolling the dice until you “make your point” (i.e., roll that same
point value). You lose by rolling a 7 before making your point.*/


import java.security.SecureRandom;
import java.util.Scanner;

public class gameOfCraps {
    static Scanner in = new Scanner(System.in);
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {WIN, CONTINUE, LOSE}

    public static void main(String[] args) {
        int choice;
        do {
            int point = 0;
            Status status;
            int sum = rollDice();

            switch (sum) {
                case 7, 11 -> status = Status.WIN;
                case 2, 3, 12 -> status = Status.LOSE;
                default -> {
                    status = Status.CONTINUE;
                    point = sum;
                    System.out.printf("point is %d%n", point);
                }
            }

            while (status == Status.CONTINUE) {
                sum = rollDice();
                if (sum == point) {
                    status = Status.WIN;
                } else {
                    if (sum == 7 || sum == 11) {
                        status = Status.LOSE;
                    }
                }
            }
            if (status == Status.WIN) {
                System.out.println("player Wins");
            } else {
                System.out.println("Player Loses ");
            }

            System.out.println("would you like to continue ? \n if yes \npress :1\n if no \n press:99");
            choice = in.nextInt();
        }
        while (choice != 99);

    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);


        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d ", die1, die2, sum);

        return sum;
    }
}