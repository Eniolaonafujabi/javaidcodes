package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionalTest {
    @Test
    public void testAirConditionIsOn() {
        AirConditional dualInverter = new AirConditional();
        boolean stateOfTheAirConditionIfItIsOnOrOff = false;
        stateOfTheAirConditionIfItIsOnOrOff = dualInverter.checkIfItIsONAndOff("on");
        assertTrue(stateOfTheAirConditionIfItIsOnOrOff);
    }

    @Test
    public void testAirConditionIsOff() {
        AirConditional dualInverter = new AirConditional();
        boolean stateOfTheAirConditionIfItIsOnOrOff;
        assertTrue(stateOfTheAirConditionIfItIsOnOrOff = dualInverter.checkIfItIsONAndOff("on"));
        stateOfTheAirConditionIfItIsOnOrOff = dualInverter.checkIfItIsONAndOff("off");
        assertFalse(stateOfTheAirConditionIfItIsOnOrOff);
    }

    @Test
    public void testAirConditionIfItIgnoreCasesOfInput() {
        AirConditional dualInverter = new AirConditional();
        boolean stateOfTheAirConditionIfItIsOnOrOff = dualInverter.checkIfItIsONAndOff("ON");
        assertTrue(stateOfTheAirConditionIfItIsOnOrOff);
    }

    @Test
    public void testAirConditionalTempretureCanBeIncrease() {
        AirConditional dualInverter = new AirConditional();
        assertTrue(dualInverter.checkIfItIsONAndOff("On"));
        boolean ifStateIncrease = dualInverter.increaseAirCondition(27);
        assertTrue(ifStateIncrease);
    }
    @Test
    public void testAirConditionalCan_tBeIncreaseByMoreThanThirty(){
        AirConditional dualInverter = new AirConditional();
        assertTrue(dualInverter.checkIfItIsONAndOff("On"));
        boolean ifStateIncrease = dualInverter.increaseAirCondition(37);
        assertFalse(ifStateIncrease);
    }
    @Test
    public void testAirConditionalCanBeDecrease(){
        AirConditional dualInverter = new AirConditional();
        assertTrue(dualInverter.checkIfItIsONAndOff("On"));
        boolean ifStateDecrease = dualInverter.decreaseAirConditonal(20);
        assertTrue(ifStateDecrease);
    }
    @Test
    public void testAirConditionalCantBeDecreaseBylessThanSixteen(){
        AirConditional dualInverter = new AirConditional();
        assertTrue(dualInverter.checkIfItIsONAndOff("On"));
        boolean ifStateDecrease = dualInverter.decreaseAirConditonal(13);
        assertFalse(ifStateDecrease);
    }

}