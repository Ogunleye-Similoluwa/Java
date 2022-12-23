import chap8.StringManipulation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulationTest {
    @Test
    public void testStringManipulation() {
        String [] adeola = {"1","c","d","e"};
        assertEquals(1, StringManipulation.manipulate(adeola));

    }
}
