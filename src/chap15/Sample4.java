package chap15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Sample4 {
    public static void main(String[] args) {
//        System.setIn();
//        System.setOut();
//        System.setErr();
//
        byte[] bytes = "Hello, world!".getBytes();
        try(PrintStream stream = new PrintStream("C:\\Users\\user\\IdeaProjects\\javaSimex13\\src\\chap15\\dataTXT")) {
            System.setOut(stream);

            try (DataOutputStream dos = new DataOutputStream(System.out)) {
                dos.write(bytes);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
            catch(IOException e){
                System.err.println(e.getMessage());
            }

    }
}
