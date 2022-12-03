package Chief1.Turtle;

public class Pen {
    private PenPosition pen= PenPosition.DOWN;

    public PenPosition getPenPosition() {
        return pen;
    }

    public void setPenPosition(PenPosition pen) {
        this.pen = pen;
    }

    public void setPosition(PenPosition position) {
    }
}
