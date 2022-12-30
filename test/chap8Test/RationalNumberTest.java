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
        RationalNumbers numbers = new RationalNumbers();
        assertEquals(3, numbers.addRational(2,4));
    }
}
