package chap5;

import java.util.Scanner;

public class TwelveDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int num = 1; num <= 12; num++) {

            System.out.print("On the ");
            switch (num) {
                case 1 -> System.out.print("First");
                case 2 -> System.out.print("Second");
                case 3 -> System.out.print("Third");
                case 4 -> System.out.print("Fourth");
                case 5 -> System.out.print("Fifth");
                case 6 -> System.out.print("Sixth");
                case 7 -> System.out.print("Seventh");
                case 8 -> System.out.print("Eight");
                case 9 -> System.out.print("Ninth");
                case 10 -> System.out.print("Tenth");
                case 11 -> System.out.print("Eleventh");
                case 12 -> System.out.print("Twelfth");
            }
            System.out.println(" day of christmas my true love sent to me\n");
            switch (num) {
                case 12:
                    System.out.println("12 ladies dancing");
                case 11:
                    System.out.println("11 Lords a-leaping	");
                case 10:
                    System.out.println(" 10 Drummers drumming");
                case 9:
                    System.out.println("9 Pipers piping");
                case 8:
                    System.out.println("8 Maids a-milking");
                case 7:
                    System.out.println(" 7 Swans a-swimming");
                case 6:
                    System.out.println("6 Geese a-laying");
                case 5:
                    System.out.println("5 golden rings");
                case 4:
                    System.out.println("4 Collie birds");
                case 3:
                    System.out.println("3 French hen");
                case 2:
                    System.out.println("2 Turtle dove ,");
                case 1:
                    System.out.println("And a partridge in a pear tree");


            }
        }
    }

}
