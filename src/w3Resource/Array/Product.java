package w3Resource.Array;

import org.w3c.dom.ranges.Range;

import java.util.Arrays;

public class Product {
    public static void main(String[] args) {
        int[] array = {10,34,23,54,76,4,76,4378,9,5,98,4,789,43,23,8,0,634,65,8,453,4,51,67,5,2,76,34,575,8,87,8,58,5,23};

        for (int num =0 ; num < array.length; num++){
            Arrays.copyOfRange(array,3,10);
        }

    }

}
