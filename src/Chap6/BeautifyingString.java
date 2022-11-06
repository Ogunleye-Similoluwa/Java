package Chap6;
/*(Beautifying Strings) Write methods that accomplish each of the following tasks:
        a) Check whether the string is terminated by a full stop, and if not, add a full stop.
        b) Check whether the string starts with a capital letter, and if not, capitalize the first letter.
        c) Use the methods developed in parts (a) and (b) and to write a method beautifyString
        that receives a string from the user, and then calls the methods in (a) and (b) to make
        sure that the string is properly formatted, in other words, the string has a full stop at
        the end, and a capitalized first letter. Make sure you output the string after it has been
        beautified! */


import java.util.Scanner;

public class BeautifyingString {
    public static String fullStop(String sentence) {
//        String last = String.valueOf(sentence.charAt(sentence.length() -1));
//        if (!last.equals(".")) {
//            sentence += ".";
//        }
//        else {
//            sentence += "";
//        }
//        return sentence;
        String last = ".";
        String words = String.valueOf(sentence.charAt(sentence.length() - 1));
        if (!(words + last).equals(sentence)) {
            sentence += last;
        } else {
            sentence = sentence + sentence;
        }
        return sentence;
    }

    public static String capitalize(String capital) {
        capital = capital.toUpperCase().charAt(0) + capital.substring(1).toLowerCase();

    return capital;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String words = in.nextLine();
        System.out.println(BeautifyingString.capitalize(fullStop(words)));


    }
}
