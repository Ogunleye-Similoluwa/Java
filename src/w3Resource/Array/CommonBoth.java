package w3Resource.Array;

public class CommonBoth {
    public static void main(String[] args) {
        int [] array ={1,1,2,3,4,4,3,2,22,5,3,4,5,3,2,3,7};
        int [] array2={1,34,67,56,5,};

        for (int j : array) {
            for (int k : array2) {
                if (j == k) {
                    System.out.println(j);
                }

            }

        }

    }
}
