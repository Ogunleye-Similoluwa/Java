package chap14.dietelExample;

public class StringIndex {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxy";
        System.out.printf("C is located at index %d%n",letters.indexOf('c'));
        System.out.printf("a is located at index %d%n",letters.indexOf('a',0));
        System.out.printf("$ is located at index %d%n",letters.indexOf('$'));
        System.out.printf("C is located at index %d%n",letters.lastIndexOf('c'));
        System.out.printf("a is located at index %d%n",letters.lastIndexOf('a',25));
        System.out.printf("$ is located at index %d%n",letters.lastIndexOf('$'));
        System.out.printf(" def is located at index %d%n",letters.indexOf("def"));
        System.out.printf("def is located at index %d%n",letters.indexOf("def",25));
        System.out.printf("hello is located at index %d%n",letters.indexOf("hello"));
        System.out.printf(" def is located at index %d%n",letters.lastIndexOf("def"));
        System.out.printf("def is located at index %d%n",letters.lastIndexOf("def",25));
        System.out.printf("hello is located at index %d%n",letters.lastIndexOf("hello"));

        String word = "abcdefghijklmabcdefghijklm";

        System.out.printf("%s%n",word.substring(20));
        System.out.printf("%s",word.substring(3,6));
        String s1 = "Happy ";
        String s2 = "Birthday";
        System.out.printf("%n%s ",s1.concat(s2));

    }
}
