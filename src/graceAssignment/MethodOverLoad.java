package graceAssignment;

public class MethodOverLoad {
    int addNumber(int num1, int num2){
        return  num1 + num2;
    }
    double addNumber(int num1, double num2){
        return (int) num1+ num2;
    }
     double addNumber(double num1, double num2){
        return  num1 + num2;
    }
     double addNumber(double num1, int num2){
        return  (num1+ num2);
    }

    public static void main(String[] args) {
        MethodOverLoad overLoad = new MethodOverLoad();

        System.out.println(overLoad.addNumber(2,2));
        System.out.println();
        System.out.println();
        System.out.println(overLoad.addNumber(2,7.0));
        System.out.println();
        System.out.println();
        System.out.println(overLoad.addNumber(6.0,8.0));
        System.out.println();
        System.out.println();
        System.out.println(overLoad.addNumber(11.2,6));
    }
}
