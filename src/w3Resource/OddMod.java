package w3Resource;
import java.util.Scanner;
public class OddMod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter odd number");
        int oddNo = input.nextInt();

        int count = 1;
        while(count >= 1) {
            count = count + 2;
            if (oddNo == count) {
                System.out.println("1");
            }

        }
    }
}
