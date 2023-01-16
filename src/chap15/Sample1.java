package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Sample1 {
    public static void main(String[] args) {
        byte[] bytes = new byte[30];
        try {
            FileInputStream stream = new FileInputStream("C:\\Users\\user\\IdeaProjects\\javaSimex13\\src\\chap15\\text.txt");
            stream.read(bytes);
            for (byte line :bytes){
                if (Character.isLetterOrDigit(line)|| Character.isSpaceChar(line)){
                    System.out.print(Character.toString(line));
                }
            }
            stream.close();
            //System.out.println(Arrays.toString(bytes));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
