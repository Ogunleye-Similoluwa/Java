package Chap6;

import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        SecureRandom randomNumbers= new SecureRandom();

        for (int count = 1 ; count <= 10; count++){
            int dice = 1 + randomNumbers.nextInt(6);
            System.out.println( " " + dice);



        }
    }
}
