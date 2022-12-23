package Chief1.Turtle;

public class Turtle {
    private int xCoordinate;
    private int yCoordinate;
    private Pen pen;
    private Cardinal direction = Cardinal.EAST;

    public Turtle() {
    }

    public Turtle(int x, int y) {
        xCoordinate = x;
        yCoordinate = y;
    }

    public Turtle(int x, int y, Cardinal direction) {
        this(x, y);
        this.direction = direction;

    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void changePenPosition(PenPosition position) {
    pen.setPosition(position);
    }
}
