package w3Resource.ConditionalStatement;

import java.lang.String;

public class Reverse {
    public static void main(String[] args) {
        int[] stringArrays = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] newArray = rev(stringArrays);
        for (int i : newArray) {
            System.out.printf("% d,", i);
        }
        System.out.println(reverse("Simex"));
        System.out.println(capitalize("SIMEx"));

    }
    public static int [] rev(int [] array){
        int [] newArray = new int[array.length];
        int secondIndexCount = 0;
        for (int i = array.length -1; i > -1 ; i--) {
            newArray[secondIndexCount] = array[i];
            secondIndexCount++;

        }
        return newArray;}
    public static String  reverse (String  rev){
      String reverse = "";
        for (int i = rev.length() -1; i > -1 ; i--) {
            reverse+= rev.charAt(i);
        }

      return reverse;
    }
    public static String capitalize(String name){
        String resOfTheWord = "";
        String newCapital = String.valueOf(name.charAt(0)).toUpperCase();
        for (int i = 1; i <= name.length()-1 ; i++) {
            resOfTheWord +=  String.valueOf(name.charAt(i)).toLowerCase();
        }
        return newCapital + resOfTheWord;
    }

}
