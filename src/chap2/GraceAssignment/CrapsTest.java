package tdd;
/* You roll two dice. Each die has six faces, which contain one, two, three, four, five and
six spots, respectively. After the dice have come to rest, the sum of the spots on the two
upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
you must continue rolling the dice until you “make your point” (i.e., roll that same
point value). You lose by rolling a 7 before making your point. */

import Chap6.Craps;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class CrapsTest {
    @Test
    public  void rollDiceAndWin(){
        Craps dice = new Craps();
        dice.sum = 7;
        assertSame(dice.getStatus(), Craps.Status.WIN);
    }
    @Test
    public void rollDiceAndLose(){
        Craps dice = new Craps();
        dice.sum = 3;
        assertSame(dice.getStatus(), Craps.Status. LOSE);
    }
    @Test
    public void rollDiceAndContinue(){
        Craps dice = new Craps();
        dice.sum = 10;
        assertSame(dice.getStatus(), Craps.Status.CONTINUE);
    }
}
