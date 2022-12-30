package chap8Test;

import chap8.RationalNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RationalNumberTest {
    @Test
    public void testRational() {
        RationalNumbers numbers = new RationalNumbers(2,4);
        numbers.getRational();
        assertEquals(1, numbers.getNumerator());
        assertEquals(2,numbers.getDenominator());
    }
}
