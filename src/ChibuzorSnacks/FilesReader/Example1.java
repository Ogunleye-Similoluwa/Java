package ChibuzorSnacks.FilesReader;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader("C:\\Users\\user\\IdeaProjects\\javaSimex13\\src\\ChibuzorSnacks\\FilesReader\\cohort13");
            bufferedReader = new BufferedReader(reader);
            System.out.println(bufferedReader.readLine());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (bufferedReader != null);
            bufferedReader.close();
        }

    }
}
