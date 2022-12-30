package chap8;

public class RationalNumbers {
    private int numerator;
    private int denominator;
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


    public  void getRational(int numerator, int denominator){
        double rem = (double) numerator / denominator;
        this.numerator = (int) (rem * numerator);
        this.denominator = (int) (rem * denominator);
    }
    public  void getRational(){
        double rem = (double) numerator / denominator;
        this.numerator = (int) (rem * numerator);
        this.denominator = (int) (rem * denominator);
    }
    public static  double div(double num1, double num2) {
        return num1/num2;
    }

    public static void main(String[] args) {
    double num = 2.0/4.0;
        System.out.println(num);
        RationalNumbers no = new RationalNumbers();
        no.getRational(2,4);
        System.out.println(no.getNumerator());
        System.out.println(no.getDenominator());
    }

}
