package w3Resource.Array;

import java.security.SecureRandom;

public class ArraySorting {

    public static void ascendingOrder(int[] array) {
            for (int sorting = 0; sorting < array.length -1; sorting++) {
                for (int comparing = 0; comparing < array.length -1 -comparing; comparing++) {
                    if (array[comparing] > array[comparing + 1]) {
                        int temp = array[comparing];
                        array[comparing] = array[comparing + 1];
                        array[comparing + 1] = temp;

                    }
                }
            }
    }

    public static void descendingOrder(int[] array) {
        for (int sorting = 0; sorting < array.length -1; sorting++) {
            for (int comparing = 0; comparing < array.length -1 -comparing; comparing++) {
                if (array[comparing] < array[comparing + 1]) {
                    int temp = array[comparing];
                    array[comparing] = array[comparing + 1];
                    array[comparing + 1] = temp;

                }
            }
        }
    }

    public static int[] shuffling(int[] array) {
        SecureRandom randomNumbers= new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            int randomIndex =  randomNumbers.nextInt(array.length - 1);
            int temp = array[randomIndex];
            array[randomIndex] = array[0];
            array[0] = temp;
        }
        return array;
    }

    /*
    public static int[] descendingOrder(int[] array) {
        int swap = 1;
        while (swap!= 0) {
            swap = 0;
            for (int sorting = 0; sorting < array.length - 1; sorting++) {
                int currentValue = array[sorting];
                for (int comparing = sorting; comparing < array.length; comparing++) {
                    if (array[comparing] > currentValue) {
                        int temp = array[comparing];
                        array[comparing] = currentValue;
                        currentValue = temp;
                        swap++;
                    }
                }
                array[sorting] = currentValue;
            }
        }
        return array;
    }
     */
}
