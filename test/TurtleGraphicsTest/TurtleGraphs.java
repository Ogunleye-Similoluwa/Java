package TurtleGraphicsTest;


import TurtleGraphics.Position;
import TurtleGraphics.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TurtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;


public class TurtleGraphs {
    private Turtle turtle;
    @BeforeEach
    public void startAllTestWith(){
        turtle = new Turtle();
    }
    @Test
    public void turtleExistTest() {
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }

    @Test
    public void turtleCanMovePenUpTest() {
        Turtle turtle = new Turtle();
        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest() {
        Turtle turtle = new Turtle();
        turtle.penUp();
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    public void turtleCanFaceRightWhileFacingEast(){
        assertEquals(EAST, turtle.getCurrentDirections());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirections());
    }
    @Test
    public void turtleCanFaceRightWhileFacingSouth(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirections());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirections());
    }
    @Test
    public void turtleCanFaceRightWhileFacingWest(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirections());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirections());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirections());
    }
    @Test
    public void turtleCanFaceRightWhileFacingNorth(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirections());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirections());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirections());
        turtle.turnRight();
        assertEquals(EAST, turtle.getCurrentDirections());
    }
    @Test
    public void turtleCanFaceLeftWhileFacingEast(){
        assertEquals(EAST, turtle.getCurrentDirections());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirections());
    }
    @Test
    public void turtleCanFaceLeftWhileFacingNorth(){
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirections());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirections());
    }
    @Test
    public void turtleCanFaceLeftWhileFacingWest(){
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirections());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirections());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirections());
    }
    @Test
    public void turtleCanFaceLeftWhileFacingSouth(){
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirections());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirections());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirections());
        turtle.turnLeft();
        assertEquals(EAST, turtle.getCurrentDirections());
    }
    @Test
    public void turtleCanMoveForwardWhileFacingEast(){
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        turtle.move(5);
        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
    }

}