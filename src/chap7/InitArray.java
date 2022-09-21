package chap7;

import java.security.SecureRandom;

public class InitArray {
    public static void main(String[] args) {
     /*   int[] array = new int[10];

        System.out.printf("%s%8s%n", "index","value");

        for (int count = 0; count < array.length; count++)
            System.out.printf("%d%8d%n", count,array[count]);


        int[] array = {10,20,30,40,50,60,70,80,90,100};

        System.out.printf("%s%8s%n", "index","value");

        for (int count = 0; count < array.length; count++)
            System.out.printf("%d%8d%n", count,array[count])


        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        for (int count = 0; count < array.length; count++){
            array[count] = 2 + 2 * count;
        }

        System.out.printf("%s%8s%n", "index","value");

        for (int count = 0; count < array.length; count++)
            System.out.printf("%d%8d%n", count,array[count]);


        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total =0;

        for (int count = 0; count < array.length; count++) {
            total += array[count];
        }
            System.out.printf("%d",total);



        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        for (int count = 0; count < array.length; count++) {
            if (count == 10) {
                System.out.printf("%5d :", 100);
            } else {
                System.out.printf("%02d-%02d :",
                        count * 10, count * 10 + 9);
            }

            for (int asterisks = 0; asterisks < array[count]; asterisks++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int count = 1; count <= 100; count++){
            ++frequency[1 + random.nextInt(6) ];

        }

        System.out.printf("%s%8s%n", "index","value");

        for (int count = 1; count < frequency.length; count++)
            System.out.printf("%d%8d%n", count,frequency[count]);
    }

}