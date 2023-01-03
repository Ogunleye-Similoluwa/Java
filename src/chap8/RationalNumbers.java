package chap8;

public class RationalNumbers {
    private static int numerator;
    private static int denominator;
    public RationalNumbers(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }
    public RationalNumbers(){}

    public int getNumerator() {
        return numerator;
    }


    public int getDenominator() {
        return denominator;
    }


    public static void getRational(int numerator, int denominator){
        double rem = (double) numerator / denominator;
      RationalNumbers.numerator = (int) (rem * numerator);
        RationalNumbers.denominator = (int) (rem * denominator);
    }
    public static void getRational(){
        double rem = (double) numerator / denominator;
        numerator = (int) (rem * numerator);
        denominator = (int) (rem * denominator);
    }
    public static  double div(double num1, double num2) {
        return num1/num2;
    }
    public static double addRational(double num1, double num2){
        getRational((int) num1, (int) num2);
        return numerator + denominator;
    }
    public static  double subtractRational(double num1, double num2){
        getRational((int) num1, (int) num2);
        return numerator - denominator;
    }
    public static double multiplyRational(double num1, double num2){
        getRational((int) num1, (int) num2);
        return numerator * denominator;
    }
    public static double divideRational(double num1, double num2){
        getRational((int) num1, (int) num2);
        double rem = (double) numerator / denominator;
        numerator = (int) (rem * numerator);
        denominator = (int) (rem * denominator);
        return (double) numerator / denominator;
    }


    public static void main(String[] args) {
    double num = 2.0/4.0;
        System.out.println(num);
        RationalNumbers no = new RationalNumbers();
        getRational(2,4);
        System.out.println(no.getNumerator());
        System.out.println(no.getDenominator());
    }

}
