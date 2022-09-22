package tdd.w3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import w3Resource.tdd.Sum;

public class SumTest {

    @Test
    public void addNumber() {
        Sum sum = new Sum();
        sum.addNumber(2,3);
        assertEquals(5,sum.addNumber(2,3));
    }

    @Test
    public void calculationOperation(){
        Sum sum = new Sum();
        int result = sum.calculationOperation(-5,8,6);
        assertEquals(43,result);
    }

}

