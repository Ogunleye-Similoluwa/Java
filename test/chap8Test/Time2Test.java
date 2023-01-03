package chap8Test;

import chap8.Time;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class Time2Test {
    Time t;
    @BeforeEach
    public void setUp(){
         t  = new Time();

    }
    @Test
    public void tickWorksTest(){
        t. setHour(11);
        t.setMinute(59);
        t.setSecond(52);
        t.tick();
        assertEquals(53,t.getSecond());

    }
    @Test
    public void incrementHourTest(){
        t. setHour(11);
        t.setMinute(59);
        t.setSecond(52);
        t.incrementHour();
        assertEquals(12,t.getHour());

    }
    @Test
    public void incrementMinuteTest(){
        t. setHour(11);
        t.setMinute(26);
        t.setSecond(52);
        t.incrementMinute();
        t.tick();
        assertEquals(27,t.getMinute());
        assertEquals(53,t.getSecond());

    }
    @Test
    public  void incrementToNextDayTest(){

    }

}
