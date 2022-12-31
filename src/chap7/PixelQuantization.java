package chap7;
/*(Pixel Quantization) Use a one-dimensional array to solve the following problem: You want
to eventually perform some basic compression on an image. Assume that you will only be operating
on a single row of the image, and that pixel colors are represented as simple numbers in the array. You
are required to quantize the values of the pixels in the row. In other words, any pixel values appearing
in a range will assume a value in that range as indicated below. This creates redundancy that can lead
to better compression. Overwrite the original values in the array.
a) For 0–20: 10
b) For 21–40: 30
c) For 41–60: 50
d) For 61–80: 70
e) For 81–100: 90
f) For 101–120: 110
g) For 121–140: 130
h) For 141–160: 150
i) For 161–180: 170, and for all other pixel values, assumed a quantized value of 190
Print the array with the new, quantized values*/



import java.lang.reflect.Array;
import java.util.Arrays;

public class PixelQuantization {
    public static void main(String[] args) {
//        int[] arr = new int[21];
//        for (int i = 1; i < arr.length; i++) {
//            if (i % 2 != 0) {
//                arr[i] = i * 10;
//                System.out.print(arr[i]);
//            }
//            System.out.println();
//        }
//        for (int j = 0  ; j  <= 190; j+=20) {
//            System.out.printf("%nFor %01d -%d: ", j + 1, j + 20);
//            System.out.print(" ");
//        }
//
        int [] arr = {10,12,14,16,23,54,65,34,34,56,4523,54,12,46,213,67,456,586,34,865};
        int [] newArray = pixel(arr);
       // for (int i :newArray) {
        System.out.println( Arrays.toString(newArray));
        //}

   }
   public static int [] pixel(int []  array){
    //    int[] newArray = new int[array.length];

       for (int i = 0; i < array.length ; i++) {
           if (array[i] >0 && array[i] <= 20){
            array[i] = 10;
           }
           else if (array[i] >20 && array[i] <=40){
               array[i] = 30;
           }
          else if (array[i] >40 && array[i] <= 60){
               array[i] = 50;
           }
          else if (array[i] >60 && array[i] <= 80){
               array[i] = 70;
           }
           else if (array[i] >80 && array[i] <= 100){
               array[i] = 90;
           }
          else if (array[i] >100 && array[i] <= 120){
               array[i] = 110;
           }
          else if (array[i] >120 && array[i] <= 140){
               array[i] = 130;
           }
           else if (array[i] > 140 && array[i] <= 160) {
               array[i] = 150;
           }
           else if (array[i] > 160&& array[i] <= 180){
               array[i] = 170;
           }
           else {
               array[i] = 190;
           }
       }
    return array;
   }
}