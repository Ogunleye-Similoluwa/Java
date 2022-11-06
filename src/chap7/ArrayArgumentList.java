package chap7;

public class ArrayArgumentList {
    public static  double average(double ... numbers){
        double total = 0.0;
        for (int d = 0; d <numbers.length; d++){
            total +=numbers[d];
        }
        return  total/numbers.length;
    }

    public static void main(String[] args) {
        ArrayArgumentList array = new ArrayArgumentList();
        System.out.println(average(10.0,20.0));

    }


}
