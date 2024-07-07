package turtlegame;

import static turtlegame.Direction.*;

public class Turtle {

    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0, 0);
    private boolean penIsUp = true;

    public boolean penIsUp() {
        return penIsUp;
    }

    public void putPenUp() {
        setStateOfPen(true);
    }

    public void penIsDown() {
        setStateOfPen(false);
    }

    public void setStateOfPen(boolean state){
        penIsUp = state;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == North) {face(EAST);}
        else if (currentDirection == WEST) {face(North);}
        else if (currentDirection == SOUTH){face(WEST);}
        else if(currentDirection == EAST){face(SOUTH);}
    }

    public void turnLeft() {
        if (currentDirection == North) {face(WEST);}
        else if (currentDirection == WEST) {face(SOUTH);}
        else if (currentDirection == SOUTH){face(EAST);}
        else if(currentDirection == EAST){face(North);}
    }

    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void moveForward(int number) {
        if(currentDirection == EAST)currentPosition.changeColumnPosition(number-1,currentDirection);
        else if(currentDirection == SOUTH)currentPosition.changeRowPosition(number-1,currentDirection);
        else if (currentDirection == WEST)currentPosition.changeColumnPosition(number-1,currentDirection);
        else if (currentDirection == North)currentPosition.changeRowPosition(number-1,currentDirection);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
