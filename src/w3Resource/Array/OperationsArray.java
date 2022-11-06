package w3Resource.Array;

import java.util.Arrays;

public class OperationsArray {
    public static int totalArray(int[] arr) {
//        int [] newArr = new int[arr.length];
        int total = 0;
        for (int j : arr) {
            total += j;
        }

        return total;
    }

    public static int minArray(int[] arr) {

        int smallest = arr[0];
        for (int i : arr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int maxArray(int[] arr) {

        int largest = arr[0];
        for (int i : arr) {
            if (i > largest) {
                largest= i;
            }
        }
        return largest;
    }

    public static int [] sumOperations(int [] arr){

//        int [] secArr = new int[arr.length];
//        int total = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j <arr.length ; j++) {
//                if(i == j){
//                    continue;
//                }
//                else {
//                    total += arr[j];
//                }
//
//            }
//            secArr[i] =total;
//
//        }

      return new int[]{totalArray(arr) - maxArray(arr)};
    }
    public static void desArray(int [] arr) {

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
    public static void ascArray(int [] arr) {
        int temp;
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {5,4,5,6, 8, 9,5,98,4,789,43,23};
        OperationsArray.ascArray(array);
        for (int j : array) {
            System.out.print(j);
            System.out.print(" ");
        }
        }

    }


