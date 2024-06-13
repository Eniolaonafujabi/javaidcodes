package tdd;

public class AirConditional {

    public boolean checkIfItIsONAndOff(String StateOfAcIfIsOnOrOff) {
        if (StateOfAcIfIsOnOrOff.equalsIgnoreCase("on")) {
            return true;
        }
        if (StateOfAcIfIsOnOrOff.equalsIgnoreCase("off")) {
            return false;
        }
        return false;
    }
    public boolean increaseAirCondition(int temperature) {
        int higest = 30;
        int lowest = 16;
        int average = 23;
        boolean moreThanHighest = (temperature>higest);
        if (moreThanHighest) {
            return false;
        }
        return (temperature>average);
    }

    public boolean decreaseAirConditonal(int tempreture) {
        int higest = 30;
        int lowest = 16;
        int average = 23;
        boolean lessThanLowest = (tempreture<lowest);
        if (lessThanLowest) {
            return false;
        }
        return (tempreture<average);
    }
}
