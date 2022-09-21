import ChibuzorAssignment.TestDriller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestDrillerTest {
    TestDriller Test;
    @BeforeEach
    public void startAllTestWith(){
         Test = new TestDriller();
    }



    @Test
    public void CheckThatObjectExists(){
        assertNotNull(Test);
    }

    @Test
    public void PricePerCopy(){
        assertEquals(2000,Test.PricePerCopy(1));
    }
    @Test
    public void PriceFor1_4Copies(){
    assertEquals(4000,Test.PriceFor1_4Copies(2));
    }
    @Test
    public void  PriceFor5_9Copies(){
        assertEquals(9000,Test. PriceFor5_9Copies(5));
    }
    @Test
    public void  PriceFor10_29Copies(){
        assertEquals(16000,Test. PriceFor10_29Copies(10));
    }
    @Test
    public void  PriceFor30_49Copies(){
        assertEquals(45000,Test. PriceFor30_49Copies(30));
    }
    @Test
    public void  PriceFor50_99Copies() {
        assertEquals(65000, Test.PriceFor50_99Copies(50));
    }
    @Test
    public void  PriceFor100_199Copies() {
        assertEquals(120000, Test.PriceFor100_199Copies(100));
    }
    @Test
    public void  PriceFor200_499Copies() {
        assertEquals(220000, Test.PriceFor200_499Copies(200));
    }
    @Test
    public void  PriceFor500Copies() {
        assertEquals(500000, Test.PriceFor500Copies(500));
    }

}
