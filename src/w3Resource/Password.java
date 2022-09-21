package w3Resource;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Set password");
        String password = input.nextLine();
        System.out.printf("Your password is :%s",password);
    }
}
