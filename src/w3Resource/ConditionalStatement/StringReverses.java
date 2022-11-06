package w3Resource.ConditionalStatement;



public class StringReverses {

    public static String  reverseStrings(String letters){
        String letter = "";
        for (int i = letters.length() -1; i >= 0 ; i--) {
            letter = letter + " " + letters.charAt(i);

        }
        return letter;
    }
    public static String capitalizeString(String letters){
        String letter = "";
        letter = letter +  letters.toUpperCase().charAt(0);
        for (int i = 1; i < letters.length() ; i++){
            letter = letter + "" + letters.charAt(i);
        }

        return letter;
    }


}
