package w3Resource.Array;

public class findIndex {
    public static  int findIndex(int [] array , int t){
        if (array == null) {
            return -1;
        }

            int len = array.length;
        int i = 0;
        while (i < len) {
            if (array[i] == t){

                System.out.println(i);

        }
            else {
                return i = i +1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println(findIndex(array,49));
    }
}
