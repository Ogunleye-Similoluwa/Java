package chap14.dietelExample;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "Goodbye";
        String s3 = "Happy Birthday";
        String s4 = "Happy Birthday";

        System.out.println(s1+ "\n" +  s2 +"\n"+  s3+"\n" + s4);
        if (s1.equals("Hello")){
            System.out.println("Hello");
        }
        else{
            System.out.println("Not hello");
        }
        if (s1 == "Hello"){
            System.out.println("Hello is the same as object");
        }
        else{
            System.out.println("Not hello");
        }
        if (s3.equalsIgnoreCase(s4)){
            System.out.printf("%s and %s are t he same ",s3,s4);
        }
        else{
            System.out.printf("Not equals case ignored ");
        }

    }
}
