package ChibuzorAssignment;

public class Pattern {

        public static void main(String[] args) {


            for (int a = 1; a <= 6; a++) {
                for (int count = 1;count <= a ;count++)
                    System.out.print(" "+count);
                System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println();

            for (int a = 6; a >0; a--) {
                for (int count = 1; count <= a ; count++)
                    System.out.print(" " + count);
                System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println();

            for (int a = 1; a <=6; a++){
                for (int count = 1; count < a + 1; count++)
                 for (int no = 6; no > count -1 ; no--)
                    System.out.print(" " + no);
                System.out.println();
            }

            System.out.println();
            System.out.println();
            System.out.println();

            for(int a = 6; a >0; a--) {
                for (int count = 1; count < a - 1; count++)
                    System.out.print(" ");
                for (int no = 6; no > a -1; no--)
                    System.out.print(" "+ no);
                System.out.println();



        }
    }

}
