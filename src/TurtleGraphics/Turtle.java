package TurtleGraphics;

import static TurtleGraphics.Direction.*;

public class Turtle {
    private Pen pen;
    private Direction direction;
    private Position currentPosition;
    public Turtle() {
        pen = new Pen();
        pen.penUp();
        direction = EAST;
        currentPosition = new Position(0,0);
    }

    public void penUp() {
        pen.penUp();

    }

    public boolean isPenUp() {
        return pen.isPenUp();
    }

    public void penDown() {
        pen.penDown();
    }

    public Direction getCurrentDirections() {
        return direction;
    }

    public void turnRight() {
//        if (direction == EAST) {
//            direction = SOUTH;
//        }
//        else if (direction == SOUTH) {
//            direction = WEST;
//        }
//        else if (direction == WEST) {
//            direction = NORTH;
//        }
//        else if (direction == NORTH) {
//            direction = EAST;
//        }
        switch (direction) {
            case EAST -> face(SOUTH);
            case SOUTH -> face(WEST);
            case NORTH -> face(EAST);
            case WEST -> face(NORTH);
        }
    }
    private void face(Direction change){
        direction = change;
    }
    public void turnLeft() {
        switch (direction) {
            case SOUTH -> face(EAST);
            case WEST -> face(SOUTH);
            case  EAST-> face(NORTH);
            case NORTH -> face(WEST);
        }
    }


    public void move(int numberOfSpecifiedSteps) {
        switch (direction){
            case EAST -> {
                currentPosition.setColumns(currentPosition.getColumns() + numberOfSpecifiedSteps);
            }
            case SOUTH -> {
                currentPosition.setRow(currentPosition.getRow() + numberOfSpecifiedSteps);
            }
        }

    }
    public Position getCurrentPosition(){
        return currentPosition;
    }
}
