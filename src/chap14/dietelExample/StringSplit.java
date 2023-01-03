package chap14.dietelExample;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence =in.nextLine();
        String [] tokens = sentence.split(" ");
        System.out.println(tokens.length);
        for (String character :tokens){
            System.out.println(character);
        }


    }
}
