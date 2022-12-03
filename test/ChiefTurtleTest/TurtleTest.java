package ChiefTurtleTest;

import Chief1.Turtle.Cardinal;
import Chief1.Turtle.Pen;
import Chief1.Turtle.PenPosition;
import Chief1.Turtle.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurtleTest {
    private Turtle ijapa;
    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
        Pen biro = new Pen();
        ijapa.setPen(biro);
    }
    @Test
    public void changePenPosition(){
        assertEquals(PenPosition.DOWN, ijapa.getPen().getPenPosition());
        ijapa.changePenPosition(PenPosition.UP);
        assertEquals(PenPosition.UP, ijapa.getPen().getPenPosition());

    }
    @Test
    public void moveForward(){
            assertEquals(0, ijapa.getxCoordinate());
        assertEquals(0, ijapa.getyCoordinate());
       // assertEquals(Cardinal.EAST,ijapa.getDirection());
    }
}
