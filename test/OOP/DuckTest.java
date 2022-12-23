package OOP;

import Polymorphism.*;
import org.junit.jupiter.api.Test;

public class DuckTest {
    @Test
    public void duckTest(){
        F1 f1 = new F1();
        F2 f2 = new F2();
        F3 f3 = new F3();
        Q1 q1 = new Q1();
        Q2 q2 = new Q2();
        Q3 q3 = new Q3();
        Duck mountainDuck = new Duck(f2,q1);
        Duck rubberDuck = new Duck(f3,q2);
        Duck ilasaDuck = new Duck(f2,q3);
        mountainDuck.fly();
        mountainDuck.setFlyable(f1);
        mountainDuck.fly();

    }
}
