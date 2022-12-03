package chap8Test;

import chap8.Cylinder.Cylinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CylinderTest {
    Cylinder cylinder;

    @BeforeEach
    public void setUp(){
        cylinder = new Cylinder();
    }
    @Test
    public void weCanSetRadiusAndHeightTest() throws Exception {
        cylinder.setHeight(34.0);
        cylinder.setRadius(56.2);
        assertEquals(34.0, cylinder.getHeight());
        assertEquals(56.2, cylinder.getRadius());
    }
    @Test
    public void weCantSetRadiusAndHeightWithNegativeNumbersTest() throws Exception {
        try {
            cylinder.setRadius(-56.2);
            cylinder.setHeight(-34.0);
            assertEquals(34.0, cylinder.getHeight());
            assertEquals(56.2, cylinder.getRadius());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public  void canCalculateVolumeTest() throws Exception {
        cylinder.setHeight(34.0);
        cylinder.setRadius(56.2);
        assertEquals(337366.08462734096,cylinder.calculateVolume());
    }
}
