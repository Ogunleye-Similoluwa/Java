package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void switchOn() {
        AutomaticBike benz = new AutomaticBike();
        benz.powerOn();
        assertTrue(benz.powerStat());
    }

    @Test
    public void switchOff() {
        AutomaticBike benz = new AutomaticBike();
        benz.powerOff();
        assertFalse(benz.powerStat());
    }

    @Test
    public void speed() {
        AutomaticBike benz = new AutomaticBike();
        benz.powerOn();
        assertTrue(benz.powerStat());
        assertEquals(0, benz.getSpeed());
    }
    @Test
    public void acceleration1(){
        AutomaticBike benz = new AutomaticBike();
        benz.powerOn();
        assertTrue(benz.powerStat());
        assertEquals(0, benz.getSpeed());
        benz.accelerateGear1(15);
        assertEquals(16,benz.getAcceleration());


    }
    @Test
    public void acceleration2(){
        AutomaticBike benz = new AutomaticBike();
        benz.powerOn();
        assertTrue(benz.powerStat());
        assertEquals(0, benz.getSpeed());
        benz.accelerateGear2(23);
        assertEquals(25,benz.getAcceleration());
    }
    @Test
    public void acceleration3(){
        AutomaticBike benz = new AutomaticBike();
        benz.powerOn();
        assertTrue(benz.powerStat());
        assertEquals(0, benz.getSpeed());
        benz.accelerateGear3(40);
        assertEquals(43,benz.getAcceleration());
    }
    @Test
    public void acceleration4(){
        AutomaticBike benz = new AutomaticBike();
        benz.powerOn();
        assertTrue(benz.powerStat());
        assertEquals(0, benz.getSpeed());
        benz.accelerateGear4(42);
        assertEquals(46,benz.getAcceleration());
    }


}
