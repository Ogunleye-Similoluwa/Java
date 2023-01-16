package chap15;

import java.io.FileOutputStream;
import java.io.IOException;

public class Sample2 {
    public static void main(String[] args) {
        byte[] bytes = new byte[30];

        try (FileOutputStream stream = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\javaSimex13\\src\\chap15\\text2.txt")){
                stream.write("Simex".getBytes());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
