package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AirConditionerTest {


    @Test
    public void switchOn() {
        AirConditioner myAc = new AirConditioner();
        myAc.powerOn();
        assertEquals(16, myAc.getTemperature());
        assertTrue(myAc.powerOnStat());
        assertEquals(16, myAc.getTemperature());

    }


    @Test
    public void switchOff() {
        AirConditioner myAc = new AirConditioner();
        myAc.powerOn();
        assertTrue(myAc.powerOnStat());
        assertEquals(16, myAc.getTemperature());
        myAc.powerOff();
        assertFalse(myAc.powerOnStat());


    }


    @Test
    public void settingTemperature() {
        AirConditioner myAc = new AirConditioner();
        myAc.powerOn();
        assertTrue(myAc.powerOnStat());
        myAc.setTemperature(24);
        assertEquals(24, myAc.getTemperature());

    }

    @Test
    public void increaseTemperature() {
        AirConditioner myAc = new AirConditioner();
        myAc.powerOn();
        assertTrue(myAc.powerOnStat());
        myAc.setTemperature(20);
        assertEquals(20, myAc.getTemperature());
        myAc.increaseTemperature(10);
        assertEquals(30, myAc.getTemperature());
    }

    @Test
    public void decreaseTemperature() {
        AirConditioner myAc = new AirConditioner();
        myAc.powerOn();
        assertTrue(myAc.powerOnStat());
        myAc.setTemperature(28);
        assertEquals(28, myAc.getTemperature());
        myAc.decreaseTemperature(200);
        assertEquals(16, myAc.getTemperature());
    }

    @Test
    public void beyondTemperature(){
        AirConditioner myAc = new AirConditioner();
        myAc.powerOn();
        assertTrue(myAc.powerOnStat());
        myAc.setTemperature(25);
        assertEquals(25,myAc.getTemperature());
        myAc.beyondTemperature(55);
        assertEquals(30,myAc.getTemperature());

    }

    @Test
    public void belowTemperature(){
        AirConditioner myAc = new AirConditioner();
        myAc.powerOn();
        assertTrue(myAc.powerOnStat());
        myAc.setTemperature(25);
        assertEquals(25,myAc.getTemperature());
        myAc.belowTemperature(-300);
        assertEquals(16,myAc.getTemperature());



    }
}

