package ChibuzorAssignment;

public class TrianglePrintingProgram {
    public static void main(String[] args) {


        for (int a = 0; a <= 10; a++) {
            for (int count = 0;count < a ;count++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int a = 10; a >=0; a--) {
            for (int count = 0; count <= a ; count++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int a = 1; a <=10; a++){
            for (int count = 1; count < a + 1; count++)
                for (int no = 10; no > count - 1 ; no--)
                    System.out.print("*");
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for(int a = 10; a >0; a--) {
            for (int count = 0; count < a - 1; count++)
                System.out.print(" ");
            for (int no = 10; no > a -1; no--)
                System.out.print("*");
            System.out.println();


        }


        }
}
