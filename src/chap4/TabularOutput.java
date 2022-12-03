package chap4;

public class TabularOutput {
    public static void main(String[] args) {


//        for (int n1 = 1; n1 <= 5; n1++) {
//            System.out.print("\n" + n1);
//            for (int n2 = 2; n2 <= 2; n2++) {
//                System.out.print("   " + Math.pow(n1, n2));
//                for (int n3 = 3; n3 <= 3; n3++) {
//                    System.out.print("    " + Math.pow(n1, n3));
//                    for (int n4 = 4; n4 <= 4; n4++) {
//                        System.out.print("    " + Math.pow(n1, n4));
//                        for (int n5 = 5; n5 <= 5; n5++) {
//                            System.out.print("  " + Math.pow(n1, n5));
//
//
//                        }
//                    }
//
//                }
//            }
//
//        }
        int count = 1;
        while (count <= 5){
            for (int i = 1; i <= 4; i++) {
                System.out.print( "  " +(int)Math.pow(count, i));
            }
            System.out.println();
            count++;

    }
    }
}
