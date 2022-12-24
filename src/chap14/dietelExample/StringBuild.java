package chap14.dietelExample;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello ,How are you");
        System.out.printf("""
                %s
                %d
                %d
                """
,builder.toString(),builder.length(),builder.capacity());
        builder.ensureCapacity(95);
        System.out.println(builder.capacity());
        builder.setLength(10);
        System.out.println(builder);


        StringBuilder builder2 = new StringBuilder("Hello there");
        System.out.println( builder2.charAt(0)  +"\n"+ builder2.charAt(4));
        char [] charArray = new char[builder2.length()];
        builder2.getChars(0,builder2.length(),charArray,0);
        for (char c : charArray) {
            System.out.println(c);
        }
        builder2.setCharAt(0,'T');
        builder2.setCharAt(6,'H');
        System.out.println(builder2);
        builder2.reverse();
        System.out.println(builder2);
    }
}
