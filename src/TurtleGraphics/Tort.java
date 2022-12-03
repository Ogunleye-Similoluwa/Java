package TurtleGraphics;

public class Tort {
    public static void main(String[] args) {
        int [][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
                array[1][2] = 1;
                array[2][1] = 1;
                array[4][4] = 1;
                array[1][3]= 1;
              }
           }
            for (int[] i : array) {
                for (int j :i) {
                    System.out.print(j + " ");

                }
                System.out.println();



           }
        for (int[] i : array) {
            for (int j :i) {
                if (j == 1) {
                    System.out.print("*" + "  ");
                } else  {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }

    }
}
