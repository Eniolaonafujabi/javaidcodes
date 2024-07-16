package turtlegame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    private Turtle ijapa;
    @BeforeEach
    public void setUp(){
        ijapa = new Turtle();
    }

    @Test
    public void testTurtlePenIsUp() {
        assertTrue(ijapa.penIsUp());
    }

    @Test
    public void putPenUp(){
        assertTrue(ijapa.penIsUp());
    }

    @Test
    public void putPenDown(){
        ijapa.penIsDown();
        assertFalse(ijapa.penIsUp());
    }

    @Test
    public void testThatICanMoveFromEastToSouth(){
    assertSame(Direction.East,ijapa.getCurrentDirection());
    ijapa.turnRight();
    assertSame(Direction.South,ijapa.getCurrentDirection());
    }

    @Test
    public void testThatICanMoveFromSouthToWest(){
        assertSame(Direction.East,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.South,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.West,ijapa.getCurrentDirection());
    }

    @Test
    public void testThatICanMoveFromWestToNorth(){
        assertSame(Direction.East,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.South,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.West,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.North,ijapa.getCurrentDirection());
    }

    @Test
    public void testThatICanMoveFromNorthToEast(){
        assertSame(Direction.East,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.South,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.West,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.North,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.East,ijapa.getCurrentDirection());
    }

    @Test
    public void teatThatICanTurnFromEastToNorth(){
        assertSame(Direction.East,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.North,ijapa.getCurrentDirection());
    }

    @Test
    public void teatThatICanTurnFromNorthToWest(){
        assertSame(Direction.East,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.North,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.West,ijapa.getCurrentDirection());
    }

    @Test
    public void teatThatICanTurnFromWestToSOUTH(){
        assertSame(Direction.East,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.North,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.West,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.South,ijapa.getCurrentDirection());
    }

    @Test
    public void teatThatICanTurnFromWestToEast(){
        assertSame(Direction.East,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.North,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.West,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.South,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.East,ijapa.getCurrentDirection());
    }

    @Test
    public void testThatICanMoveForwardWhenFacingEast(){
        assertSame(Direction.East,ijapa.getCurrentDirection());
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(0,4),ijapa.getCurrentPosition());
    }

    @Test
    public void testThatICanMoveForwardWhenFacingSouth(){
        assertSame(Direction.East,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.South,ijapa.getCurrentDirection());
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(4,0),ijapa.getCurrentPosition());
    }

    @Test
    public void testThatICanMoveForwardWhenFacingWest(){
        assertSame(Direction.East,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.South,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.West,ijapa.getCurrentDirection());
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(0,-4),ijapa.getCurrentPosition());
    }

    @Test
    public void testThatICanMoveForwardWhenFacingNorth(){
        assertSame(Direction.East,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.South,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.West,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.North,ijapa.getCurrentDirection());
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(-4,0),ijapa.getCurrentPosition());
    }
}