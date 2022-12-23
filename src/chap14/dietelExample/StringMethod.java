package chap14.dietelExample;

public class StringMethod {
    public static void main(String[] args) {

        String [] strings = {"started","starting","ended","ending" };
        for (String s : strings) {
            if (s.startsWith("st")){
                System.out.println(s +" : starts with  st" );
            }
        }
        for (String s : strings) {
            if (s.startsWith("art",2)){
                System.out.println(s +" : starts with  art" );
            }
    }
        for (String s : strings) {
            if (s.endsWith("ed")){
                System.out.println("");
                System.out.printf("%s ends with ed",s);
            }
            System.out.println("");
        }
}
    }
