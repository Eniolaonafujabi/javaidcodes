package turtlegame;

import static turtlegame.Direction.*;

public class Turtle {

    private Direction currentDirection = East;
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
        currentDirection = currentDirection.turnRight();
//        if (currentDirection == North) {face(East);}
//        else if (currentDirection == West) {face(North);}
//        else if (currentDirection == South){face(West);}
//        else if(currentDirection == East){face(South);}
    }

    public void turnLeft() {
        currentDirection = currentDirection.turnLeft();
//        if (currentDirection == North) {face(West);}
//        else if (currentDirection == West) {face(South);}
//        else if (currentDirection == South){face(East);}
//        else if(currentDirection == East){face(North);}
    }

//    private void face(Direction direction) {
//        currentDirection = direction;
//    }

    public void moveForward(int number) {
        if(currentDirection == East)currentPosition.changeColumnPosition(number-1,currentDirection);
        else if(currentDirection == South)currentPosition.changeRowPosition(number-1,currentDirection);
        else if (currentDirection == West)currentPosition.changeColumnPosition(number-1,currentDirection);
        else if (currentDirection == North)currentPosition.changeRowPosition(number-1,currentDirection);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
