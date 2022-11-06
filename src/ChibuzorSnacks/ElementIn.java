package ChibuzorSnacks;


public class ElementIn {
    public static void check(int num, int [] arr) {
        int count = 0;
        for (int j : arr) {
            if (num == j) {
                System.out.print("True :" ); System.out.print("Index position " + count);
            } else {
                System.out.print("False: ");   System.out.print("Index position " + count);
            }
            count++;
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6};
        check(25,array);
    }
}
