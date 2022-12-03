package TurtleGraphics;

public class Position {
    private  int columns;
    private  int row;

    public Position(int rows, int columns) {
        this.row = rows;
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "Position{" +
                "columns=" + columns +
                ", row=" + row +
                '}';
    }

    @Override
    public  boolean equals(Object o) {
        Position  compared = (Position) o;
        if (compared.row == this.row && compared.columns == this.columns){
            return true;
        }
        return  false;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
