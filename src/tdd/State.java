package tdd;

import java.util.Arrays;

public class State {

    public GeoPoliticalZone checkZone(String state){
        for(GeoPoliticalZone z : GeoPoliticalZone.values()){
            boolean checking = checkState(z,state);
            if(checking){
                return z;
            }
        }
        return null;
    }
    private boolean checkState(GeoPoliticalZone zone , String state){
        String[] listOfStates = zone.getState();
        for(String s : listOfStates){
            if(s.equalsIgnoreCase(state)){
                return true;
            }
        }
        return false;
    }
}