package w3Resource.Array;



public class Twodim {
    public static void main(String[] args) {
        int [][] character = new int[10][10];
        for (int i =0 ; i < 10; i++){
            for (int j = 0 ; j < 10; j ++){
                System.out.print((character[i][j]));
            }
            System.out.println();
        }
    }
}
