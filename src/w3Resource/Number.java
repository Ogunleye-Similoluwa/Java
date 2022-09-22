package w3Resource;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number");
        int no = input.nextInt();
        System.out.printf("%d + %d%d + %d%d%d",no,no,no,no,no,no);
    }
}
