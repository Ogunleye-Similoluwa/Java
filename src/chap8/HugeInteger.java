package chap8;


import java.util.Arrays;

public class HugeInteger {
    private static int[] huges= new int[3];

    public static int parse(String number) {
      int []  huge = new int[3];
        int length= String.valueOf(number).length();
        int j = 0;
        if(length  ==huge.length){
        for (int i = 0; i < huge.length; i++) {
            huge[0] = 1;
            huge[i] = number.charAt(i);
            System.out.println(huge[i]);
            System.out.println(number.charAt(i));
            System.out.println(Arrays.toString(huge));
        }

//        for (int k : huge) {
//            j = (j * 10) + k;
//        }
//        return j;
    }

        return 0;
    }

    public static int print() {
        int [] newArray = {1,2,3};
        int j = 0;
        for (int k : newArray) {
            j = (j * 10) + k;
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(HugeInteger.parse("123"));
        System.out.println(HugeInteger.print());
    }
}