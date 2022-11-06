package Chap6;

public class LeapYear {
    public int years;

    public static int year(int leap) {

        if (leap % 400 == 0 || leap % 4 == 0){
            System.out.println(leap +"  is a leap year");

        }
       else {
            System.out.println( leap +" is not a leap year");
        }
        return  leap;
    }

    public static void main(String[] args) {
        LeapYear.year(2024);

    }
}
