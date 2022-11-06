package Chap3;

class Test {
    static {
        System.out.println("Testing");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        int[] test = {1,2,3,4,5};
        int max = test[0];
        int secondMax = test[0];
        for (int i = 0; i <= test.length -1 ; i++) {
            if (test[i] > max) {
                secondMax = max;
                max = test[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }

    public static void main(String[] args) {
//        System.out.println("simex");
    }

}
