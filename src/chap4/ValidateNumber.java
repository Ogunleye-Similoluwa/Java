package chap4;

import java.util.Scanner;

/*(Validating User Input) Modify the program in Fig. 4.12 to validate its inputs. For any input, if the value
e entered is other than 1 or 2, keep looping until the user enters a correct value.*/
public class ValidateNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number =0 ;

        while (number != 1 || number != 2){

            System.out.println("Enter number");
            number = in.nextInt();
             if (number == 1) {
                break;
            } else if (number == 2) {
                 break;
             }
        }

    }

}