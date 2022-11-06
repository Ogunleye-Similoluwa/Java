package chap4;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        //  the outer for loop deals with the number of rows you want
        //no of ;lines = no of rows = num of times the outer loop will run
        // todo pattern1
        for (int i = 1; i <= n; i++) {
            //How many columns are there with each row.
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // todo pattern2
        for (int i = 1; i <= n; i++) {
            //How many columns are there with each row.
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // todo pattern 3
        for (int i = 1; i <= n; i++) {
            //How many columns are there with each row.
            //   for (int j = n; j >= i;j--){
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // todo pattern 4
        for (int i = 1; i <= n; i++) {
            //How many columns are there with each row.
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // todo pattern5
        for (int i = 0; i < 2 * n; i++) {
            int totalNoOfColumn = i > n ? 2 * n - i : i;
            for (int col = 0; col < totalNoOfColumn; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        //todo pattern 6
        for (int i = 1; i <= n; i++) {
            int noOfSpaces = n - i;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();

    }
        System.out.println();
        // todo pattern 7
        for (int i = 1; i <= n ; i++) {

            for (int s = 1; s <= i ; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n + 1 -i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
        //todo pattern 8
        for (int i = 1; i <= n; i++) {
            int noOfSpaces = n - i;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println();
        // todo pattern 9
        for (int i = 1; i <= n ; i++) {

            for (int s = 1; s <= i ; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n + 1 -i; j++) {
                System.out.print(" ");
                System.out.print("*");

            }

            System.out.println();
        }
        System.out.println();
        // todo pattern 28
        for (int i = 1; i<= 2 *n  ; i++) {
            int totalNoOfColumn = i > n ? 2 * n -i: i;
            int noOfSpaces = n - totalNoOfColumn +1;
            for (int s = 1; s <= noOfSpaces ; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totalNoOfColumn ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        // todo pattern 30
        for (int i = 1; i <=n ; i++) {

             int noOfSpaces = n -i +1;
            for (int s = 1; s <= noOfSpaces ; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        // todo pattern 17

        for (int i = 1; i <= 2 *n ; i++) {
            int totalNoOfColumn = i > n ? 2 * n -i: i;

            for (int s = 1; s <= n -totalNoOfColumn ; s++) {
                System.out.print("  ");
            }
            for (int j = totalNoOfColumn; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= totalNoOfColumn ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
