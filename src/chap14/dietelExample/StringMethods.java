package chap14.dietelExample;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello there";
        char[] charArray = new char[5];
        System.out.println(s1);
        System.out.println(s1.length());
        for (int i = s1.length() -1; i>=0; i--){
            System.out.print(s1.charAt(i) + " ");
        }
        s1.getChars(0,5,charArray,0 );
        System.out.println( );
        for (char character:charArray) {
            System.out.print(character);
        }
    }
}
