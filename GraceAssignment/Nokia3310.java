package graceAssignment;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Nokia3310 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your name to proceed: ");
        String name = input.nextLine();
        Nokia.setName(name);

        for (int i = 1; i <= 50; i++) {
            System.out.println("Press 1 for main menu or 99 to terminate.");
            int begin = input.nextInt();
            if (begin == 1 || begin == 99) {
                if (begin == 1) {
                    Nokia.mainMenu();
                } else {
                    System.out.println("Thanks for using our app");
                    break;
                }
            } else {
                System.out.println("Enter either 1 or 99!");
            }
        }
    }


    }




