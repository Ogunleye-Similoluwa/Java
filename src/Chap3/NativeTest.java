package Chap3;

import java.util.Scanner;

public class NativeTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Native nat = new Native();

        System.out.println("Enter hair colour");
        String colour = in.nextLine();
        nat.setHairColour(colour);
        System.out.printf("The hair color is %s%n", nat.getHairColour());

    }
}
