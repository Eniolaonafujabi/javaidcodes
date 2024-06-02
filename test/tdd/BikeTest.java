package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void testBikeIsOn() {
        Bike bike = new Bike();
        boolean checkIfItOff = bike.OnAndOffBike("off");
        assertFalse(checkIfItOff);
        assertTrue(bike.OnAndOffBike("on"));
    }

    @Test
    public void testBikeIsOff() {
        Bike bike = new Bike();
        boolean checkIfBikeIfIsOn = bike.OnAndOffBike("on");
        assertTrue(checkIfBikeIfIsOn);
        assertFalse(bike.OnAndOffBike("off"));
    }

    @Test
    public void testBikeIfItCanBeAccelerated() {
        Bike bike = new Bike();
        assertTrue(bike.OnAndOffBike("on"));
        bike.acceleration(20);
        assertEquals(20, bike.checkCurrentSpeedMilesPerHour());
    }

    @Test
    public void testThatBikeCanAccelerateAtGearOne(){
        Bike bike = new Bike();
        assertTrue(bike.OnAndOffBike("on"));
        assertEquals(0,bike.checkCurrentSpeedMilesPerHour());
        bike.acceleration(15);
        assertEquals(15, bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
       assertEquals("Gear 1", bike.CheckGear());
    }

    @Test
    public void testThatBikeCanAccelerateAtGearTwo(){
        Bike bike = new Bike();
        assertTrue(bike.OnAndOffBike("on"));
        assertEquals(0,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 1", bike.CheckGear());
        bike.acceleration(23);
        assertEquals(23,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 2", bike.CheckGear());
    }

    @Test
    public void testThatBikeCanAccelerateAtGearThree(){
        Bike bike = new Bike();
        assertTrue(bike.OnAndOffBike("on"));
        assertEquals(0,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 1", bike.CheckGear());
        bike.acceleration(23);
        assertEquals(23,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 2", bike.CheckGear());
        bike.acceleration(10);
        assertEquals(33,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 3", bike.CheckGear());
    }

    @Test
    public void testThatBikeCanAccelerateAtGearFour(){
        Bike bike = new Bike();
        assertTrue(bike.OnAndOffBike("on"));
        assertEquals(0,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 1", bike.CheckGear());
        bike.acceleration(23);
        assertEquals(23,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 2", bike.CheckGear());
        bike.acceleration(10);
        assertEquals(33,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 3", bike.CheckGear());
        bike.acceleration(10);
        assertEquals(43,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 4", bike.CheckGear());
    }

    @Test
    public void testThatBikeCantDecelerateMoreThanTheCurrentMilesPerHour(){
        Bike bike = new Bike();
        assertTrue(bike.OnAndOffBike("on"));
        assertEquals(0,bike.checkCurrentSpeedMilesPerHour());
        bike.deceleration(5);
        assertEquals(0,bike.checkCurrentSpeedMilesPerHour());
    }

    @Test
    public void testThatDecelerate(){
        Bike bike = new Bike();
        assertTrue(bike.OnAndOffBike("on"));
        bike.acceleration(30);
        assertEquals(30,bike.checkCurrentSpeedMilesPerHour());
        bike.deceleration(10);
        assertEquals(20,bike.checkCurrentSpeedMilesPerHour());
    }

    @Test
    public void testThatI_can_tInputNegativeNumberToDecelerate() {
        Bike bike = new Bike();
        assertTrue(bike.OnAndOffBike("on"));
        bike.acceleration(30);
        assertEquals(30,bike.checkCurrentSpeedMilesPerHour());
        bike.deceleration(-10);
        assertEquals(30,bike.checkCurrentSpeedMilesPerHour());
    }

    @Test
    public void testThatICanMoveFromGearToAnotherGearByIncreasing(){
        Bike bike = new Bike();
        assertTrue(bike.OnAndOffBike("on"));
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 1", bike.CheckGear());
        bike.acceleration(30);
        assertEquals(30,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 2", bike.CheckGear());
        bike.acceleration(10);
        assertEquals(40,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 3", bike.CheckGear());
    }

    @Test
    public void testThatICanMoveFromGearToAnotherGearByDecreasing(){
        Bike bike = new Bike();
        assertTrue(bike.OnAndOffBike("on"));
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 1", bike.CheckGear());
        bike.acceleration(30);
        assertEquals(30,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 2", bike.CheckGear());
        bike.acceleration(10);
        assertEquals(40,bike.checkCurrentSpeedMilesPerHour());
        bike.changeGear(bike.checkCurrentSpeedMilesPerHour());
        assertEquals("Gear 3", bike.CheckGear());
        bike.deceleration(10);
        assertEquals(30,bike.checkCurrentSpeedMilesPerHour());
        bike.deceleration(10);
        assertEquals(20,bike.checkCurrentSpeedMilesPerHour());
    }
}