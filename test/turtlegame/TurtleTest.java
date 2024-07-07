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
    assertSame(Direction.EAST,ijapa.getCurrentDirection());
    ijapa.turnRight();
    assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
    }

    @Test
    public void testThatICanMoveFromSouthToWest(){
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
    }

    @Test
    public void testThatICanMoveFromWestToNorth(){
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.North,ijapa.getCurrentDirection());
    }

    @Test
    public void testThatICanMoveFromNorthToEast(){
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.North,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
    }

    @Test
    public void teatThatICanTurnFromEastToNorth(){
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.North,ijapa.getCurrentDirection());
    }

    @Test
    public void teatThatICanTurnFromNorthToWest(){
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.North,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
    }

    @Test
    public void teatThatICanTurnFromWestToSOUTH(){
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.North,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
    }

    @Test
    public void teatThatICanTurnFromWestToEast(){
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.North,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
    }

    @Test
    public void testThatICanMoveForwardWhenFacingEast(){
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(0,4),ijapa.getCurrentPosition());
    }

    @Test
    public void testThatICanMoveForwardWhenFacingSouth(){
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(4,0),ijapa.getCurrentPosition());
    }

    @Test
    public void testThatICanMoveForwardWhenFacingWest(){
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(0,-4),ijapa.getCurrentPosition());
    }

    @Test
    public void testThatICanMoveForwardWhenFacingNorth(){
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.North,ijapa.getCurrentDirection());
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(-4,0),ijapa.getCurrentPosition());
    }
}