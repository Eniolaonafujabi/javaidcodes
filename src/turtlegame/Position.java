package turtlegame;

public class Position {

    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void changeRowPosition(int step,Direction direction) {
       if(Direction.South == direction)row+=step;
       else if (Direction.North==direction)row-=step;
    }

    public void changeColumnPosition(int step, Direction direction) {
        if (Direction.West ==direction)column-=step;
        else if (Direction.East ==direction)column+=step;
    }

    @Override
    public boolean equals(Object pos) {
        Position enteredPosition = (Position) pos;
        return this.row == enteredPosition.row && this.column == enteredPosition.column;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
