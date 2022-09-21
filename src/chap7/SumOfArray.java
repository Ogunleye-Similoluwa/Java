package chap7;

public class SumOfArray {
    public static void main(String[] args) {
        int [] array = {10, 20 , 46, 67, 24, 76, 48,46};
        int sum = 0;
        for (int index = 0 ; index < array.length; index++){
            sum+= array[index];
        }
        System.out.println("The sum of the values is : " +sum);
    }
}
