package chap7;

public class ArrayMethod {
    public int addNumbers(int [] numbers){
        int total =0;
        for (int i =0; i < numbers.length; i++){
            total += numbers[i];
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayMethod array = new ArrayMethod();
        int [] numbers = {12,33,23,43,4,2,34,54,21,12,344,54,32,12,34,5,32,32,43,65,76,76,54,32,2};
        System.out.println("The sum of the arrays is  : " + array.addNumbers(numbers));
    }

}
