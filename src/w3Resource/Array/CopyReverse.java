package w3Resource.Array;

public class CopyReverse {
    public static void main(String[] args) {
        int[] array = {10,34,23,54,76,4,76,4378,9,5,98,4,789,43,23,8,0,634,65,8,453,4,51,67,5,2,76,34,575,8,87,8,58,5,23};
        int [] array2 = new int[35];

        for (int i =0; i < array2.length; i++){
            array2[i] = array[i];
            System.out.print( "  " +array[i] );

            System.out.print(" "+array2[i] );
        }
        System.out.println();
        for (int j = array2.length -1; j > -1; j--){
            System.out.print(" " + array2[j]);
       }
    }
}
