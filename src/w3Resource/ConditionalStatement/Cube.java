package w3Resource.ConditionalStatement;



public class Cube {
    public static void main(String[] args) {

        int number  ;

        double total ;

        for (int count = 1; count <= 4; count++) {
            for (  number = 3; number <= 3; number++) {
                total = (int) Math.pow(count, number);
                System.out.println(count + " ^ " + number + " " + total + " ");


            }
        }
    }
}
