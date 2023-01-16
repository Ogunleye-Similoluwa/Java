package chap15;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Sample3 {
    public static void main(String[] args)  {
        byte[] data = new byte[30];
        try (var dis = new DataInputStream(System.in)){
            int numberOfBytes = dis.read(data);
            //System.out.println("Number of bytes read: " + numberOfBytes);
            System.out.println(Arrays.toString(data));
            for (byte b : data){
                if (b != 0){
                    System.out.print(Character.toString(b));
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
