package w3Resource;

public class Divisible {


  public static void main(String[] args) {

   int three = 3;
      while(three < 100) {
          if (three % 3 == 0) {

              System.out.println(three + "  ");
              three = three + 3;
          }
      }
      System.out.println();
          int five = 5;
          while (five < 100) {

              if (five % 5 == 0) {


                  System.out.println(five + " ");
                  five = five + 5;
              }
          }
          System.out.println();





          for (int count = 0; count < 100; count = count + 1) {
              if ((count % 3 == 0) && (count % 5 == 0)) {


                  System.out.println(count + " ");
              }
          }

      }
}

