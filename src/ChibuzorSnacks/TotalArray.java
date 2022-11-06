package ChibuzorSnacks;

public class TotalArray {
    public static int total(int[] array){
        int sum=0;
        for (int j : array) {
            sum += j;
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        System.out.println(total(array));
    }
}
