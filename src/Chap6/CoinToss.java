package Chap6;

import java.security.SecureRandom;

public class CoinToss {
    private final SecureRandom random = new SecureRandom();

    private enum CoinType {HEADS, TAILS}

    private CoinType type;
    private int heads;
    private int tails;

    public void tossCoin() {

        for (int i = 1; i < 2; i++) {
            int flip = random.nextInt(1,3);
            if (flip == 1) {
                heads++;
            }
            if (flip == 2) {
                tails++;

            }
        }
    }

    public void flip() {
        if (heads == 1) {
            type = CoinType.HEADS;
            System.out.println(type);
        }
        if (tails == 1) {
            type = CoinType.TAILS;
            System.out.println(type);
        }
    }

    public static void main(String[] args) {
        CoinToss toss = new CoinToss();
        toss.tossCoin();
        toss.flip();
    }
}

