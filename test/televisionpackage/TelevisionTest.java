package televisionpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    private Television samsung;
    @BeforeEach
    public void setUp(){
       samsung = new Television();
    }

    @Test
    public void testTelevisionIsOff(){
        assertFalse(samsung.checkStateOfTelevision());
    }

    @Test
    public void testTelevisionIsPutOn(){
        samsung.turnOn();
        assertTrue(samsung.checkStateOfTelevision());
    }

    @Test
    public void testTelevisionIsPutOff(){
        samsung.turnOff();
        assertFalse(samsung.checkStateOfTelevision());
    }

    @Test
    public void testThatICanIncearseVolume() {
        assertFalse(samsung.checkStateOfTelevision());
        samsung.turnOn();
        assertTrue(samsung.checkStateOfTelevision());
        assertEquals(new Volume(),samsung.getStateOfVolume());
        samsung.increaseVolume();
        assertEquals(new Volume(1),samsung.getStateOfVolume());
    }

    @Test
    public void testThatICan_tIncreaseMoreThanHundred(){
        assertFalse(samsung.checkStateOfTelevision());
        samsung.turnOn();
        assertTrue(samsung.checkStateOfTelevision());
        assertEquals(new Volume(),samsung.getStateOfVolume());
        for(int i = 0 ; i < 100 ; i++){
            samsung.increaseVolume();
        }
        assertEquals(new Volume(100),samsung.getStateOfVolume());
        samsung.increaseVolume();
        assertEquals(new Volume(100),samsung.getStateOfVolume());
    }

    @Test
    public void testThatICanDecrease(){
        assertFalse(samsung.checkStateOfTelevision());
        samsung.turnOn();
        assertTrue(samsung.checkStateOfTelevision());
        assertEquals(new Volume(),samsung.getStateOfVolume());
        samsung.increaseVolume();
        assertEquals(new Volume(1),samsung.getStateOfVolume());
        samsung.decreaseVolume();
        assertEquals(new Volume(0),samsung.getStateOfVolume());
    }

    @Test
    public void testThatICan_tDecreaseBeyondZero(){
        assertFalse(samsung.checkStateOfTelevision());
        samsung.turnOn();
        assertTrue(samsung.checkStateOfTelevision());
        assertEquals(new Volume(),samsung.getStateOfVolume());
        samsung.decreaseVolume();
        assertEquals(new Volume(0),samsung.getStateOfVolume());
    }

    @Test
    public void testThatICanChangeChannel(){
        assertFalse(samsung.checkStateOfTelevision());
        samsung.turnOn();
        assertTrue(samsung.checkStateOfTelevision());
        assertEquals(new Channel(),samsung.getStateOfChannel());
    }
}