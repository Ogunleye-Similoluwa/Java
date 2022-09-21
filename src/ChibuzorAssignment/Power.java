package ChibuzorAssignment;

public class Power {
    public static void main(String[] args) {


        double total;

        for (int count = 1; count <= 5; count++) {
            for ( int number = 2; number <= 6; number++) {
                    total = (int)Math.pow(count,number);
                    System.out.println(count++   + " " + number + " "+ total + " ");



            }

        }


    }


    }
