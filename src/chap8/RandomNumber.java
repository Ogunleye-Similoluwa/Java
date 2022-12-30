package chap8;

import java.security.SecureRandom;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println(random());
    }
    public static int random (){
        SecureRandom random = new SecureRandom();
        return random.nextInt(10,100);
    }
}
