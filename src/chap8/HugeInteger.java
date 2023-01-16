package chap8;


import java.util.Arrays;

public class HugeInteger {
    private static int[] huges= new int[10];

    public static void parse(String number) {
        int length= String.valueOf(number).length();
        String [] temp = number.split("");
        if(length  <= huges.length){
        for (int i = 0; i < huges.length; i++) {
            huges[i] = Integer.parseInt(temp[i]);
        }
    }
    }

    public static int print() {
        int j = 0;
        for (int k : huges) {
            j = (j * 10) + k;
        }
        return j;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < huges.length; i++) {
            s.append(huges[i]);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        HugeInteger.parse("1224345345");
        System.out.println(HugeInteger.print());
        System.out.println();
    }
}