package chap14.dietelExample;

import java.util.Scanner;

public class StringCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character and press enter");
        String letter = in.next();
        char c = letter.charAt(0);
        System.out.println(Character.isDefined(c));
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isJavaIdentifierStart(c));
        System.out.println(Character.isJavaIdentifierPart(c));
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isLetterOrDigit(c));

    }
}
