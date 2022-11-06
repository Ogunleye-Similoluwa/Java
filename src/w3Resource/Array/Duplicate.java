package w3Resource.Array;

public class Duplicate {
    public static void main(String[] args) {
        int [] array ={1,1,2,3,4,4,3,2,22,5,3,4,5,3,2,3,7};
        for (int i = 0 ;  i < array.length -1; i++){
            for (int j = i +1 ; j < array.length -1  ; j ++){
                if (array[i] == array[j] && i !=j ){
                    System.out.println(array[j]);
                }
            }
        }

    }
}
