package chap8Test;

import chap8.RationalNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RationalNumberTest {
    @Test
    public void testRational() {
        RationalNumbers numbers = new RationalNumbers(4,8);
        numbers.getRational();
        assertEquals(2, numbers.getNumerator());
        assertEquals(4,numbers.getDenominator());

    }
    @Test
    public void addRationalNumbersTest(){
        assertEquals(3, RationalNumbers.addRational(2,4));
    }
    @Test
    public void subtractRationalNumbersTest(){
        assertEquals(-1, RationalNumbers.subtractRational(2,4));
    }
    @Test
    public void divideRationalNumbersTest(){

        assertEquals(2, RationalNumbers.multiplyRational(2,4));
    }
    @Test
    public void divideRational(){

        assertEquals(0.5, RationalNumbers.divideRational(4,8));
    }
}
