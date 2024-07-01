package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tdd.GeoPoliticalZone.SOUTHWEST;

public class StateTest {
    @Test
    public void getGeoPoliticalZone() {
        State state = new State();
        GeoPoliticalZone result = state.checkZone("lagos");
        assertSame(SOUTHWEST, result);
    }
}